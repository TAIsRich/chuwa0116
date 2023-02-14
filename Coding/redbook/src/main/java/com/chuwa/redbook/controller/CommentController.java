package com.chuwa.redbook.controller;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.payload.CommentDTO;
import com.chuwa.redbook.service.CommentService;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentController {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{post_id}/comments")
    public ResponseEntity<CommentDTO> createComment(@PathVariable(value = "post_id") Long post_id,
                                                    @RequestBody CommentDTO commentDTO) {
        CommentDTO commentResponse = commentService.createComment(post_id, commentDTO);
        return new ResponseEntity<>(commentResponse, HttpStatus.CREATED);
    }
//    List<CommentDTO> getCommentByPostId(Long postId);
    @GetMapping("/posts/{post_id}/comments")
    public List<CommentDTO> getCommentByPostId(@PathVariable(value = "post_id") Long postId) {
        return commentService.getCommentByPostId(postId);
    }
//    CommentDTO getCommentById(Long postId, Long commentId);
    @GetMapping("/posts/{post_id}/comments/{comment_id}")
    public ResponseEntity<CommentDTO> getCommentById(@PathVariable(value = "post_id") Long postId,
                                                     @PathVariable(value = "comment_id") Long commentId) {
        CommentDTO commentDTO = commentService.getCommentById(postId, commentId);
        return ResponseEntity.ok(commentDTO);
    }
//    CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDTO);
    @PutMapping("/posts/{post_id}/comments/{comment_id}")
    public ResponseEntity<CommentDTO> updateComment(@PathVariable(value = "post_id") Long postId,
                                                    @PathVariable(value = "comment_id") Long commentId,
                                                    @RequestBody CommentDTO commentDTO) {
        CommentDTO updatedCommentDTO = commentService.updateComment(postId, commentId, commentDTO);
        return ResponseEntity.ok(updatedCommentDTO);
    }

//    void deleteComment(Long postId, Long commentId);
    @DeleteMapping("/posts/{post_id}/comments/{comment_id}")
    public ResponseEntity<String> deleteComment(@PathVariable(value = "post_id") Long postId,
                              @PathVariable(value = "comment_id") Long commentId) {
        commentService.deleteComment(postId, commentId);
        return ResponseEntity.ok("Comment deleted Successfully");
    }
}
