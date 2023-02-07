package com.chuwa.cassandrablog.service;


import com.chuwa.cassandrablog.payload.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO) ;

    List<PostDTO> getAllPost();

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);

}
