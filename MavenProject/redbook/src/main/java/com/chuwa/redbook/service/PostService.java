package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDTO;

import java.util.ArrayList;
import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getPosts();

    PostDTO updatePost(PostDTO postDTO, Long id);

    void deletePostById(Long id);
}
