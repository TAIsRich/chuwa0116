package com.chuwa.CassandraBlog.Service.Impl;

import com.chuwa.CassandraBlog.Entity.Blog;
import com.chuwa.CassandraBlog.Service.BlogService;
import com.chuwa.CassandraBlog.dao.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public Blog createBlog(Blog blog) {
        Blog saved = blogRepository.save(blog);
        return saved;
    }

    @Override
    public Blog getBlog(Long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public List<Blog> getAllBlogs() {
        List<Blog> list = new ArrayList<>();
        for (Blog blog: blogRepository.findAll()) {
            list.add(blog);
        }
        return list;
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
