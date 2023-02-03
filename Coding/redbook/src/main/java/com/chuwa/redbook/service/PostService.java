package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts();

    PostDto getPostsById(Long id);

    PostDto updatePostById(Long id, PostDto postDto);

    void deletePostById(Long id);
}
