package com.chuwa.Cassandrablog.service.impl;

import com.chuwa.Cassandrablog.model.Blog;
import com.chuwa.Cassandrablog.dao.BlogRepository;
import com.chuwa.Cassandrablog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog createBlog(Blog blog) {
        Blog saved = blogRepository.save(blog);
        return saved;
    }
}
