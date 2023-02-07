package com.example.redbook.service;

import com.example.redbook.payload.PostDTO;
import com.example.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO creatPost(PostDTO postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);


}
