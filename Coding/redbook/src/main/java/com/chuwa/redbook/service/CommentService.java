package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.CommentDTO;

import java.util.*;

public interface CommentService {
    CommentDTO createComment(long postId, CommentDTO commentDTO);
    List<CommentDTO> getCommentByPostId(long postId);
    CommentDTO getCommentById(Long postId, Long commentId);

    CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDTORequest);
    void deleteComment(Long postId, Long commentId);
}
