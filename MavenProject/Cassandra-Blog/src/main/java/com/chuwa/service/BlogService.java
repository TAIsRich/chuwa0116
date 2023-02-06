package com.chuwa.service;

import com.chuwa.entity.Blog;
import java.util.List;

public interface BlogService {
	void createBlog(Blog blog);
	Blog getBlog(String id);
	void deleteBlog(String id);
	List<Blog> getAllBlogs();
	void updateBlog(Blog blog);
}
