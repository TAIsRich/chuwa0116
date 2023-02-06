package com.chuwa.controller;

import com.chuwa.payload.PostDto;
import com.chuwa.payload.PostResponse;
import com.chuwa.service.PostService;
import com.chuwa.util.AppConstants;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/posts")
public class PostController {
	@Autowired
	private PostService postService;
//	@GetMapping
//	public ResponseEntity<List<PostDto>> getAllPosts(){
//		return ResponseEntity.ok(postService.getAllPost());
//	}
	@GetMapping("{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable("id")long id){
		return ResponseEntity.ok(postService.getPostById(id));
	}
	@PostMapping
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
		return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
	}
	@PutMapping("{id}")
	public ResponseEntity<PostDto> updateById(@RequestBody PostDto postDto,@PathVariable("id")long id){
		return ResponseEntity.ok(postService.updatePost(postDto,id));
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id")long id){
		postService.deletePostById(id);
		return new ResponseEntity<>("Successfully delete a post",HttpStatus.OK);
	}
	@GetMapping
	public PostResponse getAllPosts(
			@RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
			@RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
			@RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
			@RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIR, required = false) String sortDir
	) {
		return postService.getAllPost(pageNo, pageSize, sortBy, sortDir);
	}

}
