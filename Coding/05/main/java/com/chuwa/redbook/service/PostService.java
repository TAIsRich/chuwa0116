package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDTO;

import java.util.List;
public interface PostService {
    PostDTO createPost(PostDTO postDto);

    List<PostDTO> getAllPost();

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void  deletePostById(long id);

    List<PostDTO> getAllPostWithJPQL();

    PostDTO getPostByIdJPQLIndexParameters(Long id, String title);

    PostDTO getPostByIdJPQLNamedParameters(Long id, String title);

    PostDTO getPostByIdSQLIndexParameters(Long id, String title);

    PostDTO getPostByIdSQLNamedParameters(Long id, String title);
}
