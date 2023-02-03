package com.mongoblog.mdbspringboot.service;

import com.mongoblog.mdbspringboot.entity.Post;

public interface BlogService {
    Post saveBlog(Post blogPost);
}

