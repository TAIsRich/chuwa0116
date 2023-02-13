package com.example.redbook2.service;

import com.example.redbook2.payload.PostDTO;

import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getAllPost();

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);

    List<PostDTO> getAllPostWithJPQL();
    PostDTO getPostByIdJPQLIndexParameter(Long id, String title);
    PostDTO getPostByIdJPQLNamedParameter(Long id, String title);
    PostDTO getPostByIdSQLIndexParameter(Long id, String title);
    PostDTO getPostByIdSQLNamedParameter(Long id, String title);

}
