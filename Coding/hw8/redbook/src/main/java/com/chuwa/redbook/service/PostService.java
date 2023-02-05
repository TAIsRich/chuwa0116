package com.chuwa.redbook.service;
import  java.util.List;
import com.chuwa.redbook.payload.PostDTO;

public interface PostService {
    PostDTO createPost(PostDTO PostDTO);
    List<PostDTO>getAllPosts();
    PostDTO getPostById(long id);
    PostDTO updatePost(PostDTO postDTO,long id);
    void deletePostById(long id);

}
