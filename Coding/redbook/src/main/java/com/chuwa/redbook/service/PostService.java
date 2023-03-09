package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;

import java.util.List;


public interface PostService {
    PostDto createPost(PostDto postDTO);
    List<PostDto> getAllPost();
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDTO, Long id);
    void deletePostById(Long id);
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
}
