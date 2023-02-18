package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogApiException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDTO;
import com.chuwa.redbook.service.CommentService;
import com.chuwa.redbook.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CommentServiceimpl implements CommentService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDTO createComment(Long postId, CommentDTO commentDTO) {
        // Comment comment = mapToComment(commentDTO);
        Comment comment = modelMapper.map(commentDTO, Comment.class);
        Post post = postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));
        comment.setPost(post);
        commentRepository.save(comment);
        // CommentDTO response = mapToCommentDTO(comment);
        CommentDTO response = modelMapper.map(comment, CommentDTO.class);
        return response;
    }

    @Override
    public List<CommentDTO> getCommentByPostId(Long postId) {
        List<CommentDTO> list = commentRepository
                .findByPostId(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId))
                .stream()
                // .map(comment -> mapToCommentDTO(comment))
                .map(comment -> modelMapper.map(comment, CommentDTO.class))
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public CommentDTO getCommentById(Long postId, Long commentId) {
        Post post = postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));
        if(!comment.getPost().getId().equals(post.getId())) {
            throw new BlogApiException("Comment and post does not match", HttpStatus.BAD_REQUEST);
        }
        // return mapToCommentDTO(comment);
        return modelMapper.map(comment, CommentDTO.class);
    }

    @Override
    public CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDTO) {
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
        return modelMapper.map(updatedComment, CommentDTO.class);
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
