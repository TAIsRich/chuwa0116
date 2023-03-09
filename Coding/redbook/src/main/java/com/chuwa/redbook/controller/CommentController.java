package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.service.CommentService;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentController {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{post_id}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value = "post_id") Long post_id,
                                                    @Valid @RequestBody CommentDto commentDTO) {
        CommentDto commentResponse = commentService.createComment(post_id, commentDTO);
        return new ResponseEntity<>(commentResponse, HttpStatus.CREATED);
    }
//    List<CommentDTO> getCommentByPostId(Long postId);
    @GetMapping("/posts/{post_id}/comments")
    public List<CommentDto> getCommentByPostId(@PathVariable(value = "post_id") Long postId) {
        return commentService.getCommentByPostId(postId);
    }
//    CommentDTO getCommentById(Long postId, Long commentId);
    @GetMapping("/posts/{post_id}/comments/{comment_id}")
    public ResponseEntity<CommentDto> getCommentById(@PathVariable(value = "post_id") Long postId,
                                                     @PathVariable(value = "comment_id") Long commentId) {
        CommentDto commentDTO = commentService.getCommentById(postId, commentId);
        return ResponseEntity.ok(commentDTO);
    }
//    CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDTO);
    @PutMapping("/posts/{post_id}/comments/{comment_id}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable(value = "post_id") Long postId,
                                                    @PathVariable(value = "comment_id") Long commentId,
                                                    @Valid @RequestBody CommentDto commentDTO) {
        CommentDto updatedCommentDto = commentService.updateComment(postId, commentId, commentDTO);
        return ResponseEntity.ok(updatedCommentDto);
    }

//    void deleteComment(Long postId, Long commentId);
    @DeleteMapping("/posts/{post_id}/comments/{comment_id}")
    public ResponseEntity<String> deleteComment(@PathVariable(value = "post_id") Long postId,
                              @PathVariable(value = "comment_id") Long commentId) {
        commentService.deleteComment(postId, commentId);
        return ResponseEntity.ok("Comment deleted Successfully");
    }
}
