package com.example.CassandraBlog.controller;

import com.example.CassandraBlog.payload.BlogDto;
import com.example.CassandraBlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class BlogController {


    private BlogService blogService;

    @PostMapping
    public ResponseEntity<BlogDto> createPost(@RequestBody BlogDto blogDto){
        BlogDto postResponse = blogService.createBlog(blogDto);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
}
