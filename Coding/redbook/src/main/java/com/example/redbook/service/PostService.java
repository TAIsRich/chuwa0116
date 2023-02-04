package com.example.redbook.service;

import com.example.redbook.payload.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO creatPost(PostDTO postDto);
    List<PostDTO> getAllPosts();

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);
}
