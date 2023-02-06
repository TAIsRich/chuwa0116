package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.CommentDto;

import java.net.URI;
import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/6/23
 */
public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(long postId, long id);

    CommentDto updateCommentById(long postId, long id, CommentDto commentDto);

    void deleteCommentById(long postId, long commentId);
}
