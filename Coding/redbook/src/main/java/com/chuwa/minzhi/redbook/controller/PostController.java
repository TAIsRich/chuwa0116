package com.chuwa.minzhi.redbook.controller;

import com.chuwa.minzhi.redbook.models.Post;
import com.chuwa.minzhi.redbook.payload.PostDTO;
import com.chuwa.minzhi.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")   // url prefix
public class PostController {

    // java bean
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO) {
        PostDTO postResponse = postService.createPost(postDTO);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

    @GetMapping   // default route url
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        List<PostDTO> queryResponse = postService.getAllPosts();

        return new ResponseEntity<>(queryResponse, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostByID(@PathVariable(name = "id") long id) {
        PostDTO queryResponse = postService.getPostByID(id);

        if (queryResponse.equals(PostDTO.nullPostDTO)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(queryResponse, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePost(@RequestBody PostDTO postDTO, @PathVariable(name = "id") long id) {
        PostDTO postResponse = postService.updatePostWithID(id, postDTO);

        return ResponseEntity.ok(postResponse);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {

        PostDTO res = postService.deletePostWithID(id);

        if (res.equals(PostDTO.nullPostDTO)) {
            return new ResponseEntity<>("Failed to delete post with id: " + id, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>("Successfully deleted post with id: " + id, HttpStatus.OK);
        }

    }
}
