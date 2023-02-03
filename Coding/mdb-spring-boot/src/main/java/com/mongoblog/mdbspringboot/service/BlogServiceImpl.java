package com.mongoblog.mdbspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mongoblog.mdbspringboot.entity.Post;
import com.mongoblog.mdbspringboot.dao.PostRepository;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private PostRepository postRepository;

    @Override
    public Post saveBlog(Post blogPost) {
        return postRepository.save(blogPost);
    }
}
