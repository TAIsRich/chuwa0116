package com.example.cassandrablog.service.Impl;

import com.example.cassandrablog.dao.BlogRepository;
import com.example.cassandrablog.entity.Blog;
import com.example.cassandrablog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog getBlog(Long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public List<Blog> getAllBlogs() {
        ArrayList<Blog> blogs = new ArrayList<Blog>();
        blogRepository.findAll().forEach(blogs::add);
        return blogs;
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public void updateBlog(Blog blog) {
        blogRepository.save(blog);
    }
}
