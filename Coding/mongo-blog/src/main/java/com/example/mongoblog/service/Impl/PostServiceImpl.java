package com.example.mongoblog.service.Impl;

import com.example.mongoblog.dao.PostRepository;
import com.example.mongoblog.entity.Post;
import com.example.mongoblog.payload.PostDTO;
import com.example.mongoblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Override
    public PostDTO creatPost(PostDTO postDTO) {
        //1. convert postDTO to Post
        Post post = mapToEntity(postDTO);

        //2. save Post to DB use Repository
        Post savedPost = postRepository.save(post);

        //3. convert Post back to postDTO

        return mapToDTO(savedPost);
    }

    private PostDTO mapToDTO(Post post){
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());

        return postDTO;
    }

    private Post mapToEntity(PostDTO postDTO){
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        return post;
    }
}
