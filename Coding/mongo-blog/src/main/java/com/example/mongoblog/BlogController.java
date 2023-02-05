package com.example.mongoblog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping(value="/save")
    public ResponseEntity<?> saveBlog(@RequestBody Blog blog)
    {
        blogService.saveBlog(blog);
        return new ResponseEntity("Bloh added", HttpStatus.OK);
    }
}
