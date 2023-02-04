package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceimpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    private PostDTO mapToDTO(Post post) {
        PostDTO response = new PostDTO();
        response.setId(post.getId());
        response.setContent(post.getContent());
        response.setDescription(post.getDescription());
        response.setTitle(post.getTitle());
        return response;
    }

    private Post mapToPost(PostDTO postDTO) {
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        return post;
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // 1. convert postDTO to Post
        Post post = mapToPost(postDTO);

        // 2. save Post to DB using Repository
        Post savedPost = postRepository.save(post);

        // 3. convert Post back to PostDTO
        PostDTO response = mapToDTO(savedPost);

        return response;
    }

    @Override
    public List<PostDTO> getAllPost() {
        List<Post> posts = postRepository.findAll();
        List<PostDTO> postDTOS = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
        return postDTOS;
    }

    @Override
    public PostDTO getPostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
        return mapToDTO(post);
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO, Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        Post updatedPost = postRepository.save(post);
        return mapToDTO(updatedPost);

    }

    @Override
    public void deletePostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }
}
