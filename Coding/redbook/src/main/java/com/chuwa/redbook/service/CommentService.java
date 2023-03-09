package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(Long postId, CommentDto commentDTO);
    List<CommentDto> getCommentByPostId(Long postId);
    CommentDto getCommentById(Long postId, Long commentId);
    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDTO);
    void deleteComment(Long postId, Long commentId);
}
