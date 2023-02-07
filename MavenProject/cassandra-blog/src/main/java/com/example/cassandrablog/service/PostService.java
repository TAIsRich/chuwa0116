package com.example.cassandrablog.service;


import com.example.cassandrablog.payload.PostDTO;

import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getPosts();
//    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDTO updatePost(PostDTO postDTO, Long id);

    void deletePostById(Long id);
}
