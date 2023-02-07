package com.chuwa.cassandrablog.service.Impl;


import com.chuwa.cassandrablog.dao.PostRepository;
import com.chuwa.cassandrablog.entity.Post;
import com.chuwa.cassandrablog.exception.ResourceNotFoundException;
import com.chuwa.cassandrablog.payload.PostDTO;
import com.chuwa.cassandrablog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;


    @Override
    public PostDTO createPost(PostDTO postDTO) {
        //1, covert postDTO to Post

//        Post post = new Post();
//        post.setTitle(postDTO.getTitle());
//        post.setDescription(postDTO.getDescription());
//        post.setContent(postDTO.getContent());
//
//        Post savedPost = postRepository.save(post);
//
//        PostDTO response = new PostDTO();
//        response.setId(savedPost.getId());
//        response.setTitle(savedPost.getTitle());
//        response.setDescription(savedPost.getDescription());
//        response.setContent(savedPost.getContent());
//
//        return response;
        Post post = mapToEntity(postDTO);
        Post savedPost = postRepository.save(post);
        PostDTO postResponse = mapToDTO(savedPost);
        return postResponse;


    }

    @Override
    public List<PostDTO> getAllPost() {
        List<Post> posts = postRepository.findAll();
        List<PostDTO> postDTOS = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
        return postDTOS;
    }

    @Override
    public PostDTO getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id) );

        return mapToDTO(post);
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO, long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        Post updatePost = postRepository.save(post);
        return mapToDTO(updatePost);
    }

    @Override
    public void deletePostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }

    private PostDTO mapToDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());

        return postDTO;
    }

    private Post mapToEntity(PostDTO postDTO) {
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        return post;
    }

}
