package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.DAO.BlogPost;
import com.chuwa.mongoblog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostBlogServiceImpl implements BlogService{
    @Autowired
    private BlogPostRepository blogPostRepository;

    @Override
    public BlogPost saveBlog(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }
}
