package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.payload.PostResponse;
import com.chuwa.redbook.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceimpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

//    private PostDTO mapToDTO(Post post) {
//        PostDTO response = new PostDTO();
//        response.setId(post.getId());
//        response.setContent(post.getContent());
//        response.setDescription(post.getDescription());
//        response.setTitle(post.getTitle());
//        return response;
//    }
//
//    private Post mapToPost(PostDTO postDTO) {
//        Post post = new Post();
//        post.setTitle(postDTO.getTitle());
//        post.setDescription(postDTO.getDescription());
//        post.setContent(postDTO.getContent());
//        return post;
//    }

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // 1. convert postDTO to Post
        // Post post = mapToPost(postDTO);
        Post post = modelMapper.map(postDTO, Post.class);

        // 2. save Post to DB using Repository
        Post savedPost = postRepository.save(post);

        // 3. convert Post back to PostDTO
        // postDTO response = mapToDTO(savedPost);
        PostDTO response = modelMapper.map(savedPost, PostDTO.class);

        return response;
    }

    @Override
    public List<PostDTO> getAllPost() {
        List<Post> posts = postRepository.findAll();
        // List<PostDTO> postDTOS = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
        List<PostDTO> postDTOS = posts.stream().map(post -> modelMapper.map(post, PostDTO.class)).collect(Collectors.toList());
        return postDTOS;
    }

    @Override
    public PostDTO getPostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
        // return mapToDTO(post);
        return modelMapper.map(post, PostDTO.class);
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO, Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        Post updatedPost = postRepository.save(post);
        // return mapToDTO(updatedPost);
        return modelMapper.map(updatedPost, PostDTO.class);
    }

    @Override
    public void deletePostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }

    @Override
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
        Page<Post> pagePosts = postRepository.findAll(pageRequest);
        // List<PostDTO> postDTOS = pagePosts.getContent().stream().map(p->mapToDTO(p)).collect(Collectors.toList());
        List<PostDTO> postDTOS = pagePosts.getContent().stream().map(p->modelMapper.map(p, PostDTO.class)).collect(Collectors.toList());
        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDTOS);
        postResponse.setLast(pagePosts.isLast());
        postResponse.setPageNo(pagePosts.getNumber());
        postResponse.setPageSize(pagePosts.getSize());
        postResponse.setTotalElements(pagePosts.getTotalElements());
        postResponse.setTotalPages(pagePosts.getTotalPages());
        return postResponse;
    }
}
