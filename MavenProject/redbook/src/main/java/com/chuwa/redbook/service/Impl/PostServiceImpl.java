package com.chuwa.redbook.service.Impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/1/23
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // 1. covert postDTO to Post
        Post post = postDTO.toPost();

        // 2. save Post to DB
        Post savedPost = postRepository.save(post);

        // 3. convert Post back to postDTO
        return new PostDTO(savedPost);
    }

    @Override
    public List<PostDTO> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
            .map(PostDTO::new)
            .collect(Collectors.toList());
    }

    @Override
    public PostDTO updatePostById(Long id, PostDTO postDTO) {
        Post post = postRepository.findById(id).get();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        Post savedPost = postRepository.save(post);

        return new PostDTO(savedPost);
    }

    @Override
    public Long deletePostById(Long id) {
        postRepository.deleteById(id);
        return id;
    }

}
