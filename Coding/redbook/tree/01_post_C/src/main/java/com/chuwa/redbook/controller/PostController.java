package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.PostDto;
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

    // create post method
    @PostMapping
    public ResponseEntity<PostDto> savePost(@RequestBody PostDto postDTO){
        PostDto postResponse = postService.createPost(postDTO);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

}
