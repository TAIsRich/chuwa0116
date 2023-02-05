package com.example.mongoblog.controller;

import com.example.mongoblog.payload.PostDTO;
import com.example.mongoblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO) {
//        postDTO.setId(generator.getSequenceNumber(Post.SEQUENCE_NAME));
        PostDTO postResponse = postService.createPost(postDTO);
        // generate sequence
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

//    @GetMapping
//    public List<PostDTO> getPost() {
//        return postService.getPosts();
//    }
//
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDTO, @PathVariable(name = "id") Long id) {
//        PostDTO postResponse = postService.updatePost(postDTO, id);
//        return new ResponseEntity<>(postResponse, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deletePost(@PathVariable(name = "id") Long id) {
//        postService.deletePostById(id);
//        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
//    }
}
