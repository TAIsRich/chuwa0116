package com.example.cassandrablog.controller;

import com.example.cassandrablog.entity.Blog;
import com.example.cassandrablog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/posts")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) {
        return new ResponseEntity<>(blogService.createBlog(blog), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> updateBlog(@RequestBody Blog blog) {
        blogService.updateBlog(blog);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable(name = "id") Long id) {
        blogService.deleteBlog(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable("id") Long id) {
        Blog blog = blogService.getBlog(id);
        return ResponseEntity.ok(blog);
    }
}
