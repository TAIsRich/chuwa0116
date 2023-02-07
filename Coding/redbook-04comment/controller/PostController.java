package Coding.redbook;


import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

  @Autowired
  private PostService postService;

  @PostMapping
  public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
    PostDTO postResponse = postService.createPost(postDTO);

    return new ResponseEntity<>(postResponse, HttpStatus.CREATED);

  }

  @GetMapping
  public List<PostDTO> getAllPosts(){
    return postService.getAllPosts();
  }

  @GetMapping("/{id}")
  public ResponseEntity<PostDTO> getPostById(@PathVariable(name="id") long id){
    return ResponseEntity.ok(postService.getPostById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDto, @PathVariable(name="id") long id){
    PostDTO postResp = postService.updatePost(postDto, id);
    return new ResponseEntity<>(postResp, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deletePostById(@PathVariable(name="id") long id){
    postService.deleteById(id);
    return new ResponseEntity<>("Post entity deleted successfully!", HttpStatus.OK);
  }


}
