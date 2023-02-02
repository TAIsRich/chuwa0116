package com.example.mongoblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog findBlogByName(String name){
        return blogRepository.findBlogByTitle(name);
    }

    @Override
    public Blog saveBlog(Blog blog){
        return blogRepository.save(blog);
    }
}
