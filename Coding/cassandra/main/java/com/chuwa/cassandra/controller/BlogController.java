package com.chuwa.cassandra.controller;

import com.chuwa.cassandra.entity.Post;
import com.chuwa.cassandra.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class BlogController {
    @Autowired
    private PostService blogService;

    @PostMapping
    public ResponseEntity<Post> createBlog(@RequestBody Post blog){
        return new ResponseEntity<>(blogService.createBlog(blog), HttpStatus.CREATED);
    }
}
