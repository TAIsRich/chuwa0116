package com.chuwa.cassandra.service;

import com.chuwa.cassandra.entity.Post;

public interface PostService {
    Post createBlog(Post blog);
}
