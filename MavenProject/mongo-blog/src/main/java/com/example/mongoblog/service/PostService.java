package com.example.mongoblog.service;

import com.example.mongoblog.payload.PostDTO;

import java.util.ArrayList;
import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDTO);

//    List<PostDTO> getPosts();
//
//    PostDTO updatePost(PostDTO postDTO, Long id);
//
//    void deletePostById(Long id);
}
