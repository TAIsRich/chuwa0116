package com.chuwa.redbook.service;

import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.payload.CommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    CommentDTO createComment(Long postId, CommentDTO commentDTO);
    List<CommentDTO> getCommentByPostId(Long postId);
    CommentDTO getCommentById(Long postId, Long commentId);
    CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDTO);
    void deleteComment(Long postId, Long commentId);
}
