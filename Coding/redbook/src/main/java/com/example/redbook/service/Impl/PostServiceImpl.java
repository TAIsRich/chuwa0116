package com.example.redbook.service.Impl;

import com.example.redbook.dao.PostRepository;
import com.example.redbook.entity.Post;
import com.example.redbook.payload.PostDTO;
import com.example.redbook.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDTO createPost(PostDTO postDto) {

        //1, covert postDto to post
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent((postDto.getContent()));

        //2, save Post to DB
        Post savedPost = postRepository.save(post);

        //3, convert Post back to PostDTO
        PostDTO response = new PostDTO();
        response.setId(savedPost.getId());
        response.setTitle(savedPost.getTitle());
        response.setDescription(savedPost.getDescription());
        response.setContent((savedPost.getContent()));

        return response;
    }

    public List<PostDTO> getAllPost() {
        List<Post> post = postRepository.findAll();
        List<PostDTO> postDto = post.stream().map(p -> mapToDTO(p)).collect(Collectors.toList());
        return postDto;
    }

    public PostDTO mapToDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent((post.getContent()));
        return postDTO;
    }

    public PostDTO updatePost(PostDTO postDto, long id) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent((postDto.getContent()));

        Post updatedPost = postRepository.save(post);
        return mapToDTO(updatedPost);
    }
    
    public void deletePostById(long id) {
        Post post = postRepository.findById(id).orElseThrow();
        postRepository.delete(post);
    }
}
