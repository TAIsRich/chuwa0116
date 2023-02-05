package com.chuwa.redbook.controller;

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
    public ResponseEntity<List<PostDTO>> getAllPost(){
        List<PostDTO> posts = postService.getAllPost();
        return new ResponseEntity<>(posts, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable(name = "id") long id){
        PostDTO postDTO = postService.getPostById(id);
        return new ResponseEntity<>(postDTO, HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePostById(@PathVariable(name = "id") long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePostById(@PathVariable(name = "id") long id, @RequestBody PostDTO postDTO){
        PostDTO updatePostDTO  = postService.updatePostById(id, postDTO);
        return new ResponseEntity<>(updatePostDTO, HttpStatus.ACCEPTED);
    }


}
