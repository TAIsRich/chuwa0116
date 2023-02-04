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
    public PostDTO createPost(PostDTO postDTO) {
        // 1. convert postDTO to Post
        Post post = new Post();

        // post.id is generated automatically
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        // 2. save Post to DB
        Post savedPost = postRepository.save(post);

        // 3. convert Post back to postDTO
        PostDTO response = new PostDTO();
        response.setId(savedPost.getId());
        response.setTitle(savedPost.getTitle());
        response.setDescription(savedPost.getDescription());
        response.setContent(savedPost.getContent());


        return response;
    }

//    @Override
//    public List<PostDTO> getPosts() {
//        List<Post> postList = postRepository.findAll();
//        List<PostDTO> posts = postList.stream()
//                .map(this::mapToDTO)
//                .collect(Collectors.toList());
//        return posts;
//    }
//
//    private PostDTO mapToDTO(Post post) {
//        PostDTO postDTO = new PostDTO();
//        postDTO.setId(post.getId());
//        postDTO.setTitle(post.getTitle());
//        postDTO.setDescription(post.getDescription());
//        postDTO.setContent(post.getContent());
//
//        return postDTO;
//    }
//
//    @Override
//    public PostDTO updatePost(PostDTO postDTO, Long id) {
//        Post post = postRepository.findById(id).orElseThrow(RuntimeException::new);
//        post.setTitle(postDTO.getTitle());
//        post.setDescription(postDTO.getDescription());
//        post.setContent(postDTO.getContent());
//
//        Post updatePost = postRepository.save(post);
//        return mapToDTO(updatePost);
//    }
//
//    @Override
//    public void deletePostById(Long id) {
//        Post post = postRepository.findById(id).orElseThrow(RuntimeException::new);
//        postRepository.delete(post);
//    }
}
