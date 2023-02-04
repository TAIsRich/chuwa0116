package com.chuwa.controller;

import com.chuwa.entity.Blog;
import com.chuwa.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blog")
public class BlogController {
	@Autowired
	private BlogService blogService;
	@PostMapping
	public ResponseEntity<Void> createBlog(@RequestBody Blog blog){
		blogService.createBlog(blog);
		return ResponseEntity.ok().build();
	}
}
