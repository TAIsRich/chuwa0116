package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDto;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/1/23
 */
public interface PostService {

    PostDto createPost(PostDto postDTO);

    List<PostDto> getAllPosts();

    PostDto updatePostById(long id, PostDto postDTO);

    void deletePostById(long id);

    PostDto getPostById(long id);
}
