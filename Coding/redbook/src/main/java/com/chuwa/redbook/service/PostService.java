package com.chuwa.redbook.service;
import  java.util.List;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.payload.PostResponse;

public interface PostService {
    PostDTO createPost(PostDTO PostDTO);
//    List<PostDTO>getAllPosts();
//    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
    PostResponse getAllPosts(int pageNo,int pageSize,String sortBy,String sortDir);
    PostDTO getPostById(long id);
    PostDTO updatePost(PostDTO postDTO,long id);
    void deletePostById(long id);

}
