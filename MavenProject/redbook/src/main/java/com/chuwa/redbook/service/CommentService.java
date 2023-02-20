package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.CommentDTO;

import java.util.List;

public interface CommentService {
    CommentDTO createComment(long postId, CommentDTO commentDto);

    List<CommentDTO> getCommentsByPostId(long postId);

    CommentDTO getCommentById(long postId, long id);

    CommentDTO updateCommentById(long postId, long id, CommentDTO commentDto);

    void deleteCommentById(long postId, long commentId);
}
