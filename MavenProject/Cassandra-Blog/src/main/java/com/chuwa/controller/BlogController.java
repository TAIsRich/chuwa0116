package com.chuwa.controller;

import com.chuwa.entity.Blog;
import com.chuwa.service.BlogService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {
	@Autowired
	private BlogService blogService;

	@PostMapping
	public ResponseEntity<Void> createBlog(@RequestBody Blog blog) {
		blogService.createBlog(blog);
		return ResponseEntity.ok().build();
	}

	@PutMapping
	public ResponseEntity<Void> updateBlog(@RequestBody Blog blog) {
		blogService.updateBlog(blog);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteBlog(@PathVariable("id") String id) {
     blogService.deleteBlog(id);
		return ResponseEntity.ok().build();
	}
	@GetMapping("{id}")
	public ResponseEntity<Blog> getBlog(@PathVariable("id") String id) {
		Blog blog = blogService.getBlog(id);
		return ResponseEntity.ok(blog);
	}
	@GetMapping
	public ResponseEntity<List<Blog>> getBlogs(){
		return ResponseEntity.ok(blogService.getAllBlogs());
	}
}
