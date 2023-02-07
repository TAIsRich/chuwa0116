package com.example.CassandraBlog.service;

import com.example.CassandraBlog.entity.Blog;
import com.example.CassandraBlog.payload.BlogDto;

import java.util.List;

public interface BlogService {
    BlogDto createBlog(BlogDto blogDto);

    List<BlogDto> getAllBlog();

    BlogDto getBlogById(long id);

    BlogDto updateBlog(BlogDto blog, long id);

    void deleteBlogById(long id);
}
