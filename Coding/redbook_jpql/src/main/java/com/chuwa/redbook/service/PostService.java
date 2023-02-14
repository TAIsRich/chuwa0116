package com.chuwa.redbook.service;
import com.chuwa.redbook.payload.PostDTO;

import java.util.List;



public interface PostService {
    PostDTO createPost(PostDTO PostDTO);
    List<PostDTO> getAllPosts();
//    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
//    PostResponse getAllPosts(int pageNo,int pageSize,String sortBy,String sortDir);
    PostDTO getPostById(long id);
    PostDTO updatePost(PostDTO postDTO,long id);
    void deletePostById(long id);
    List<PostDTO>getAllPostWithJPQL();
    PostDTO getPostByIdJPQLIndexParameter(Long id, String title);
    PostDTO getPostByIdJPQLNamedParameter(Long id, String title);
    PostDTO getPostByIdSQLIndexParameter(Long id, String title);
    PostDTO getPostByIdSQLNamedParameter(Long id, String title);

}
