package com.example.redbook.service;

import com.example.redbook.payload.CommentDTO;

import java.util.List;

public interface CommentService {
    CommentDTO createComment(long postId, CommentDTO commentDTO);
    List<CommentDTO> getCommentsByPostId(long postId);
    CommentDTO getCommentById(long postId, long commentId);
    CommentDTO updateComment(long postId, long commentId, CommentDTO commentDTORequest);
    void deleteComment(long postId, long commentId);
}
