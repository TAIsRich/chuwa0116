package com.mongoblog.mdbspringboot.controller;

import com.mongoblog.mdbspringboot.dao.Post;
import com.mongoblog.mdbspringboot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class PostController {
    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody Post post){
        blogService.saveBlog(post);
        return new ResponseEntity("created successfully", HttpStatus.CREATED);
    }
}
