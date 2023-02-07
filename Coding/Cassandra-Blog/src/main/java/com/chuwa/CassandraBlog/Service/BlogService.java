package com.chuwa.CassandraBlog.Service;

import com.chuwa.CassandraBlog.Entity.Blog;

import java.util.List;

public interface BlogService {
    Blog createBlog(Blog blog);
    Blog getBlog(Long id);
    List<Blog> getAllBlogs();
    void deleteBlog(Long id);
    void updateBlog(Blog blog);

}
