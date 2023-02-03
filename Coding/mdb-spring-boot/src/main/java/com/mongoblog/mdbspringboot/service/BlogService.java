package com.mongoblog.mdbspringboot.service;

import com.mongoblog.mdbspringboot.dao.Post;

public interface BlogService {
    Post saveBlog(Post blogPost);
}

