package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/6/23
 */
@RestController
@RequestMapping("api/v1/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(
        @PathVariable(value = "postId") long id,
        @RequestBody CommentDto commentDto
    ) {
        return new  ResponseEntity<>(commentService.createComment(id, commentDto),
            HttpStatus.CREATED);
    }

    @GetMapping("/posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(
        @PathVariable(value = "postId") long postId) {
        return ResponseEntity.ok(commentService.getCommentsByPostId(postId));
    }

    @GetMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> getCommentById(
        @PathVariable(value = "postId") long postId,
        @PathVariable(value = "id") long commentId
    ) {
        return ResponseEntity.ok(commentService.getCommentById(postId, commentId));
    }

    @PutMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> updateCommentById(
        @PathVariable(value = "postId") long postId,
        @PathVariable(value = "id") long commentId,
        @RequestBody CommentDto commentDto
    ) {
        return ResponseEntity.ok(commentService.updateCommentById(postId, commentId, commentDto));
    }

    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteCommentById(
        @PathVariable(value = "postId") long postId,
        @PathVariable(value = "id") long commentId
    ) {
        commentService.deleteCommentById(postId, commentId);
        return ResponseEntity.ok("Comment deleted Successfully!");
    }

}
