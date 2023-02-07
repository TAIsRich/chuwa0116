package com.chuwa.cassandra.service.impl;

import com.chuwa.cassandra.dao.PostRepository;
import com.chuwa.cassandra.entity.Post;
import com.chuwa.cassandra.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository blogRepository;

    @Override
    public Post createBlog(Post blog) {
        Post saved = blogRepository.save(blog);
        return saved;
    }
}
