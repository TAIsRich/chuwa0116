package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDTO;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/1/23
 */
public interface PostService {

    PostDTO createPost(PostDTO postDTO);

    List<PostDTO> getAllPosts();

    PostDTO updatePostById(Long id, PostDTO postDTO);

    Long deletePostById(Long id);
}
