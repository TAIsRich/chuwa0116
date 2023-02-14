package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.CommentDTO;
import com.chuwa.redbook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDTO> createComment(@PathVariable(value = "postId") long id,
                                                    @RequestBody CommentDTO commentDTO) {
        return new ResponseEntity<>(commentService.createComment(id, commentDTO), HttpStatus.OK);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<CommentDTO> getCommentByPostId(@PathVariable(value = "postId") Long postId) {
        return commentService.getCommentByPostId(postId);
    }

    @GetMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDTO> getCommentById(
            @PathVariable(value = "postId") Long postId,
            @PathVariable(value = "id") Long commentId) {
        CommentDTO commentDTO = commentService.getCommentById(postId, commentId);
        return new ResponseEntity<>(commentDTO, HttpStatus.OK);
    }

    @PutMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDTO> updateComment(@PathVariable(value = "postId") Long postId,
                                                    @PathVariable(value = "id") Long commentId,
                                                    @RequestBody CommentDTO commentDto) {
        CommentDTO updateComment = commentService.updateComment(postId, commentId, commentDto);
        return new ResponseEntity<>(updateComment, HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable(value = "postId") Long postId,
                                                @PathVariable(value = "id") Long commentId) {
        commentService.deleteComment(postId, commentId);

        return new ResponseEntity<>("Comment deleted Successfully", HttpStatus.OK);
    }
}
