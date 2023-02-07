package com.chuwa.casandrablog.service.impl;

import com.chuwa.casandrablog.dao.PostRepository;
import com.chuwa.casandrablog.entity.Post;
import com.chuwa.casandrablog.exception.ResourceNotFoundException;
import com.chuwa.casandrablog.payload.PostDTO;
import com.chuwa.casandrablog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;


    @Override
    public PostDTO createPost(PostDTO PostDTO) {
        Post post = mapToEntity(PostDTO);
        post.setId(UUID.randomUUID().toString());
        Post savedPost = postRepository.save(post);
        PostDTO postResponse = mapToDTO(savedPost);
        return postResponse;
    }

    @Override
    public PostDTO getPostById(String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return mapToDTO(post);
    }

    @Override
    public PostDTO updatePost(PostDTO postDto, String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post updatePost = postRepository.save(post);
        return mapToDTO(updatePost);
    }

    @Override
    public void deletePostById(String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }

    private PostDTO mapToDTO(Post post) {
        PostDTO PostDTO = new PostDTO();
        PostDTO.setId(post.getId());
        PostDTO.setTitle(post.getTitle());
        PostDTO.setDescription(post.getDescription());
        PostDTO.setContent(post.getContent());
        return PostDTO;
    }

    private Post mapToEntity(PostDTO PostDTO){
        Post post = new Post();
        post.setTitle(PostDTO.getTitle());
        post.setDescription(PostDTO.getDescription());
        post.setContent(PostDTO.getContent());
        return post;
    }

}
