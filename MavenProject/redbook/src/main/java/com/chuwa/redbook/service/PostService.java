package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDTO createPosts(PostDTO postDTO);

    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getAllPosts();

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    List<PostDTO> getAllPost();

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDto, long id);

    void deletePostById(long id);
}
