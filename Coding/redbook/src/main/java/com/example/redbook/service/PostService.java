package com.example.redbook.service;

import com.example.redbook.payload.PostDTO;
import com.example.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getAllPost();

    /**
     * 分页
     *
     * @param pageNo
     * @param pageSize
     * @param sortBy
     * @param sortDir
     * @return
     */
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);
}
