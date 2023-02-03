package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.payload.PostDTO;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/3/23
 */
public interface PostService {

    PostDTO createPost(PostDTO postDTO);

}
