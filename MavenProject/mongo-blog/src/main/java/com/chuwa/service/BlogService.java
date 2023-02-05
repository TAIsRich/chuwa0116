package com.chuwa.service;

import com.chuwa.entity.Blog;
import com.chuwa.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
	@Autowired
	private BlogRepository blogRepository;
	public void createBlog(Blog blog){
		blogRepository.insert(blog);
	}
}
