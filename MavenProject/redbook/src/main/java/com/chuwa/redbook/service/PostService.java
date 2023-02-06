package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;

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

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto updatePostById(long id, PostDto postDTO);

    void deletePostById(long id);

    PostDto getPostById(long id);
}
