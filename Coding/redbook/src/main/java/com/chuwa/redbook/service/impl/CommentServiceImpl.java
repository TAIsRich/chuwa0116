package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogApiException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        // Comment comment = mapToComment(commentDto);
        Comment comment = modelMapper.map(commentDto, Comment.class);
        Post post = postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));
        comment.setPost(post);
        commentRepository.save(comment);
        // CommentDTO response = mapToCommentDTO(comment);
        CommentDto response = modelMapper.map(comment, CommentDto.class);
        return response;
    }

    @Override
    public List<CommentDto> getCommentByPostId(Long postId) {
        List<CommentDto> list = commentRepository
                .findByPostId(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId))
                .stream()
                // .map(comment -> mapToCommentDTO(comment))
                .map(comment -> modelMapper.map(comment, CommentDto.class))
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public CommentDto getCommentById(Long postId, Long commentId) {
        Post post = postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));
        if(!comment.getPost().getId().equals(post.getId())) {
            throw new BlogApiException("Comment and post does not match", HttpStatus.BAD_REQUEST);
        }
        // return mapToCommentDTO(comment);
        return modelMapper.map(comment, CommentDto.class);
    }

    @Override
    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDTO) {
        Post post = postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));
        if(!comment.getPost().getId().equals(post.getId())) {
            throw new BlogApiException("Comment and post does not match", HttpStatus.BAD_REQUEST);
        }
        comment.setName(commentDTO.getName());
        comment.setEmail(commentDTO.getEmail());
        comment.setBody(commentDTO.getBody());
        Comment updatedComment = commentRepository.save(comment);
        // return mapToCommentDTO(updatedComment);
        return modelMapper.map(updatedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Long postId, Long commentId) {
        Post post = postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));
        if(!comment.getPost().getId().equals(post.getId())) {
            throw new BlogApiException("Comment and post does not match", HttpStatus.BAD_REQUEST);
        }
        commentRepository.deleteById(commentId);
    }

//    private Comment mapToComment(CommentDTO commentDTO) {
//        Comment comment = new Comment();
//        comment.setId(commentDTO.getId());
//        comment.setBody(commentDTO.getBody());
//        comment.setEmail(commentDTO.getEmail());
//        comment.setName(commentDTO.getName());
//        return comment;
//    }
//
//    private CommentDTO mapToCommentDTO(Comment comment) {
//        CommentDTO commentDTO = new CommentDTO();
//        commentDTO.setBody(comment.getBody());
//        commentDTO.setId(comment.getId());
//        commentDTO.setEmail(comment.getEmail());
//        commentDTO.setName(comment.getName());
//        return commentDTO;
//    }
}
