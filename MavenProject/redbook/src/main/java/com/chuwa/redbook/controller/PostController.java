package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/1/23
 */
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO) {
        PostDTO postResponse = postService.createPost(postDTO);
        System.out.println(postResponse);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePostById(
        @PathVariable(name = "id") Long id,
        @RequestBody PostDTO postDTO
    ) {
        return new ResponseEntity<>(postService.updatePostById(id, postDTO),
            HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deletePostById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(postService.deletePostById(id), HttpStatus.OK);
    }

}
