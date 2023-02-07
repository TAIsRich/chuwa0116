package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.payload.PostDTO;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
}
