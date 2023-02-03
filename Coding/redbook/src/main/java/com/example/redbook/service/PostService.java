package com.example.redbook.service;

import com.example.redbook.payload.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getAllPost();

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);
}
