package Coding.redbook;

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
  public ResponseEntity<CommentDTO> createComment(@PathVariable(name = "postId") long id,
                                                  @RequestBody CommentDTO commentDTO){
    CommentDTO commentResp = commentService.createComment(id, commentDTO);
    return new ResponseEntity<>(commentResp, HttpStatus.CREATED);
  }

  @GetMapping("/posts/{postId}/comments")
  public List<CommentDTO> getCommentsByPostId(@PathVariable(name="postId") Long postId){
    return commentService.getCommentsByPostId(postId);
  }

  @GetMapping("/posts/{postId}/comments/{id}")
  public ResponseEntity<CommentDTO> getCommentById(@PathVariable(name="postId") Long postId,
                                                   @PathVariable(name="id") Long commentId){
    CommentDTO resp = commentService.getCommentById(postId, commentId);
    return new ResponseEntity<>(resp, HttpStatus.OK);
  }

  @PutMapping("/posts/{postId}/comments/{id}")
  public ResponseEntity<CommentDTO> updateComment(@PathVariable(name = "postId") Long postId,
                                                  @PathVariable(name = "id") Long commentId,
                                                  @RequestBody CommentDTO commentDto){
    CommentDTO resp = commentService.updateComment(postId, commentId, commentDto);
    return new ResponseEntity<>(resp, HttpStatus.OK);

  }

  @DeleteMapping("/posts/{postId}/comments/{id}")
  public ResponseEntity<String> deleteComment(@PathVariable(name = "postId") Long postId,
                                              @PathVariable(name = "id") Long commentId){
    commentService.deleteComment(postId, commentId);
    return new ResponseEntity<>("Comment deleted successfully!", HttpStatus.OK);
  }



}
