package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDTO;

import java.util.List;


public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    PostDTO getPostById(long id);

    List<PostDTO> getAllPost();

    void deletePostById(long id);

    PostDTO updatePostById(long id, PostDTO postDTO);

}
