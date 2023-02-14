package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO) {
        PostDTO postResponse = postService.createPost(postDTO);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<PostDTO> getAllPosts() {
        return postService.getAllPost();
    }

    @GetMapping("/jpql")
    public List<PostDTO> getAllPostsJPQL() { return postService.getAllPostWithJPQL(); }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @GetMapping("/jpql-index/{id}")
    public ResponseEntity<PostDTO> getPostByIdOrTitleJPQLIndex(@PathVariable(name = "id") long id,
                                                               @RequestParam(value = "title", required = false) String title) {
        return ResponseEntity.ok(postService.getPostByIdJPQLIndexParameter(id, title));
    }

    @GetMapping("/jpql-named/{id}")
    public ResponseEntity<PostDTO>  getPostByIdOrTitleJPQLName(@PathVariable(name = "id") long id,
                                                               @RequestParam(value = "title", required = false) String title) {
        return ResponseEntity.ok(postService.getPostByIdJPQLNamedParameter(id, title));
    }

    @GetMapping("/sql-index/{id}")
    public ResponseEntity<PostDTO> getPostByIdOrTitleSQLIndex(@PathVariable(name = "id") long id,
                                                              @RequestParam(value = "title", required = false) String title) {
        return ResponseEntity.ok(postService.getPostByIdSQLIndexParameter(id, title));
    }

    @GetMapping("/sql-named/{id}")
    public ResponseEntity<PostDTO> getPostByIdOrTitleSQLParameter(@PathVariable(name = "id") long id,
                                                                  @RequestParam(value = "title", required = false) String title) {
        return ResponseEntity.ok(postService.getPostByIdSQLNamedParameter(id, title));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDTO, @PathVariable(name = "id") long id) {
        PostDTO postResponse = postService.updatePost(postDTO, id);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
        postService.deletePostById(id);
        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
    }
}
