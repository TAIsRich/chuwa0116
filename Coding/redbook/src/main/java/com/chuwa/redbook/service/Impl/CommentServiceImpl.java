package com.chuwa.redbook.service.Impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        Comment comment = mapToEntity(commentDto);
        Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
        comment.setPost(post);
        Comment saved = commentRepository.save(comment);
        return mapToDto(saved);
    }

    @Override
    public List<CommentDto> getCommentsByPostId(Long postId){
        List<CommentDto> comments = commentRepository.findByPostId(postId).stream().map(this::mapToDto).collect(Collectors.toList());
        return comments;
    }

    @Override
    public CommentDto getCommentById(Long postId, Long commentId) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
        Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

        if(!comment.getPost().getId().equals(post.getId()))  throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");

        return mapToDto(comment);
    }

    @Override
    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDtoRequest) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
        Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

        if(!comment.getPost().getId().equals(post.getId()))  throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");

        comment.setName(commentDtoRequest.getName());
        comment.setEmail(commentDtoRequest.getEmail());
        comment.setBody(commentDtoRequest.getBody());

        Comment updatedComment = commentRepository.save(comment);

        return mapToDto(updatedComment);
    }

    @Override
    public void deleteComment(Long postId, Long commentId) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
        Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

        if(!comment.getPost().getId().equals(post.getId()))  throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");

        commentRepository.delete(comment);
    }

    private CommentDto mapToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setName(comment.getName());
        commentDto.setEmail(comment.getEmail());
        commentDto.setBody(comment.getBody());

        return commentDto;
    }

    private Comment mapToEntity(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());

        return comment;
    }
}
