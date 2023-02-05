package com.chuwa.minzhi.redbook.service;

import com.chuwa.minzhi.redbook.payload.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

// info: same as view in MVC framework
// Note Post of "PostService" does not mean post request, but a post of Redbook

@Service
public interface PostService {

    // post request
    PostDTO createPost(PostDTO postDTO);

    // get request
    List<PostDTO> getAllPosts();
    PostDTO getPostByID(long id);

    // put request
    PostDTO updatePostWithID(long id, PostDTO postDTO);

    // del request
    PostDTO deletePostWithID(long id);
}
