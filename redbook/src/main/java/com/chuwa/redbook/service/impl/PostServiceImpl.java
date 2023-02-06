package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRespository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.payload.PostResponse;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    //no need to new, using autowired can use it directly,
    //related to Bean
    @Autowired
    private PostRespository postRespository;

    @Override
    public PostDTO createPost(PostDTO postDto) {
        /*
        //step1: convert postDTO to Post
        Post post = new Post();
        //post 的 id (no need to set ID here)
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

         */
        //convert DTO to Entity
        Post post = mapToEntity(postDto);

        //step2: save Post to DB use Respository
        Post savedPost = postRespository.save(post);
/*
        //step3: convert Post back to postDTO
        PostDTO response = new PostDTO();
        response.setId(savedPost.getId());
        response.setTitle(savedPost.getTitle());
        response.setDescription(savedPost.getDescription());
        response.setContent(savedPost.getContent());
*/
        PostDTO postResponse = mapToDTO(savedPost);

        //return response;
        return postResponse;
    }

    @Override
    public List<PostDTO> getAllPost(){
        List<Post> posts = postRespository.findAll();
        List<PostDTO> postDTOs = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
        return postDTOs;
    }

    @Override
    public PostDTO getPostById(long id){
        Post post = postRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return mapToDTO(post);
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO, long id){
        Post post = postRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        Post updatePost = postRespository.save(post);
        return mapToDTO(updatePost);
    }

    @Override
    public void deletePostById(long id){
        Post post = postRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRespository.delete(post);
    }

    @Override
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        //create pageable instance
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
        Page<Post> pagePosts = postRespository.findAll(pageRequest);

        //get content for page object
        List<Post> posts = pagePosts.getContent();
        List<PostDTO> postDTOS = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDTOS);
        postResponse.setPageNo(pagePosts.getNumber());
        postResponse.setPageSize(pagePosts.getSize());
        postResponse.setTotalElements(pagePosts.getTotalElements());
        postResponse.setTotalPages(pagePosts.getTotalPages());
        postResponse.setLast(pagePosts.isLast());
        return postResponse;

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

