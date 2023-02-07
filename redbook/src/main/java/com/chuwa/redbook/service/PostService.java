package com.chuwa.redbook.service;

import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDto);

    List<PostDTO> getAllPost();

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deletePostById(long id);


    /**
     * 分页
     * @param pageNo
     * @param pageSize
     * @param sortBy
     * @param sortDir
     * @return
     */

    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

}
