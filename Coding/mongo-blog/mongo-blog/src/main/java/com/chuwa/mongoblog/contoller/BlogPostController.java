package com.chuwa.mongoblog.contoller;

import com.chuwa.mongoblog.DAO.BlogPost;
import com.chuwa.mongoblog.repository.BlogPostRepository;
import com.chuwa.mongoblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogPostController {
    @Autowired
    private BlogService blogService;

    @PostMapping(value = "/post")
    public ResponseEntity<?> createPost(@RequestBody BlogPost blogPost){
        blogService.saveBlog(blogPost);
        return new ResponseEntity("Blog added", HttpStatus.CREATED);
    }
}
