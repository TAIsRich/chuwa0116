package com.chuwa.Cassandrablog.controller;

import com.chuwa.Cassandrablog.model.Blog;
import com.chuwa.Cassandrablog.service.BlogService;
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
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.createBlog(blog), HttpStatus.CREATED);
    }
}
