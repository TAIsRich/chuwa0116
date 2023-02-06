package com.chuwa.service.impl;

import com.chuwa.dao.BlogRepository;
import com.chuwa.entity.Blog;
import com.chuwa.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogRepository blogRepository;
	@Override
	public void createBlog(Blog blog) {
		blogRepository.save(blog);
	}

	@Override
	public Blog getBlog(String id) {
		return blogRepository.findById(id).get();
	}

	@Override
	public void deleteBlog(String id) {
      blogRepository.deleteById(id);
	}

	@Override
	public List<Blog> getAllBlogs() {
		List<Blog> list = new ArrayList<>();
		for (Blog blog : blogRepository.findAll()) {
			list.add(blog);
		}
		return list;
	}

	@Override
	public void updateBlog(Blog blog) {
     blogRepository.save(blog);
	}
}
