package com.chuwa.casandrablog.service;

import com.chuwa.casandrablog.payload.PostDTO;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    PostDTO getPostById(String id);

    PostDTO updatePost(PostDTO postDto, String id);

    public void deletePostById(String id);
}
