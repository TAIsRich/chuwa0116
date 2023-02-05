package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // 把payload转换成entity，这样才能dao去把该数据存到数据库中。
        Post post = new Post();
        if (postDTO.getTitle() != null) {
            post.setTitle(postDTO.getTitle());
        } else {
            post.setTitle("");
        }
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        // 此时已成功把request body的信息传递给entity

        // 调用Dao的save 方法，将entity的数据存储到数据库MySQL
        // save()会返回存储在数据库中的数据
        Post savedPost = postRepository.save(post);

        // 将save() 返回的数据转换成controller/前端 需要的数据，然后return给controller
        PostDTO postResponse = new PostDTO();
        postResponse.setId(savedPost.getId());
        postResponse.setTitle(savedPost.getTitle());
        postResponse.setDescription(savedPost.getDescription());
        postResponse.setContent(savedPost.getContent());
        return postResponse;
    }

    @Override
    public PostDTO getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());
        return postDTO;
    }

    @Override
    public List<PostDTO> getAllPost() {
        List<PostDTO> list = postRepository.findAll().stream().map(post -> {
            PostDTO postDTO = new PostDTO();
            postDTO.setId(post.getId());
            postDTO.setTitle(post.getTitle());
            postDTO.setDescription(post.getDescription());
            postDTO.setContent(post.getContent());
            return postDTO;
        }).collect(Collectors.toList());
        return list;
    }

    @Override
    public void deletePostById(long id) {
        Optional<Post> post = postRepository.findById(id);
        if(post.isPresent()){
            postRepository.deleteById(id);
        }
    }

    @Override
    public PostDTO updatePostById(long id, PostDTO postDTO) {
        Post updatedPost = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        updatedPost.setTitle(postDTO.getTitle());
        updatedPost.setDescription(postDTO.getDescription());
        updatedPost.setContent(postDTO.getContent());

        postRepository.save(updatedPost);

        PostDTO updatedPostDTO = new PostDTO();
        updatedPostDTO.setId(postDTO.getId());
        updatedPostDTO.setContent(postDTO.getContent());
        updatedPostDTO.setDescription(postDTO.getDescription());
        updatedPostDTO.setTitle(postDTO.getTitle());
        return updatedPostDTO;
    }
}
