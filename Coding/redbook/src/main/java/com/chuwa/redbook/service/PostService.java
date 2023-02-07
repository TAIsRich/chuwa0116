package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts();

    PostDto getPostsById(Long id);

    PostDto updatePostById(Long id, PostDto postDto);

    void deletePostById(Long id);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
