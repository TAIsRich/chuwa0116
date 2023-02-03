package com.chuwa.minzhi.redbook.service.implementation;

import com.chuwa.minzhi.redbook.dao.PostRepository;
import com.chuwa.minzhi.redbook.models.Post;
import com.chuwa.minzhi.redbook.payload.PostDTO;
import com.chuwa.minzhi.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    // repository (DAO) provides us an ability to access database
    @Autowired
    private PostRepository postRepository;

    // postDTO is raw data, post is an instance of Model Post (table)
    @Override
    public PostDTO createPost(PostDTO postDTO) {
        PostDTO res = new PostDTO();

        // todo: convert postDTO to Post
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        // todo: save Post to Database
        Post savedPost = postRepository.save(post);

        // todo: convert Post back to postDTO

        res.setId(savedPost.getId());
        res.setTitle(savedPost.getTitle());
        res.setContent(savedPost.getContent());
        res.setDescription(savedPost.getDescription());

        return res;
    }

    @Override
    public List<PostDTO> getAllPosts() {
        List<PostDTO> res = new ArrayList<>();

        for (Post post : postRepository.findAll()) {
            PostDTO postDTO = new PostDTO();
            postDTO.setId(post.getId());
            postDTO.setTitle(post.getTitle());
            postDTO.setDescription(post.getDescription());
            postDTO.setContent(post.getContent());

            res.add(postDTO);
        }

        return res;
    }

    @Override
    public PostDTO getPostByID(long id) {
        PostDTO res = new PostDTO();

        Optional<Post> optionalPost = postRepository.findById(id);


        if (optionalPost.isEmpty()) {
            return PostDTO.nullPostDTO;
        }

        // // orElse: return the value if present, otherwise return default value
        // Post post = optionalPost.orElse(Post.nullPost);

        Post post = optionalPost.get();

        res.setId(post.getId());
        res.setTitle(post.getTitle());
        res.setContent(post.getContent());
        res.setDescription(post.getDescription());

        return res;
    }

    @Override
    public PostDTO updatePostWithID(long id, PostDTO postDTO) {
        PostDTO res = new PostDTO();

        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isEmpty()) {
            return createPost(postDTO);
        }

        // update
        Post post = optionalPost.get();
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        post.setDescription(postDTO.getDescription());

        Post savedPost = postRepository.save(post);

        res.setId(savedPost.getId());
        res.setTitle(savedPost.getTitle());
        res.setDescription(savedPost.getDescription());
        res.setContent(savedPost.getContent());

        return res;
    }

    @Override
    public PostDTO deletePostWithID(long id) {
        PostDTO res = new PostDTO();

        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isEmpty()) {
            return PostDTO.nullPostDTO;
        }

        Post post = optionalPost.get();
        postRepository.deleteById(id);

        res.setId(post.getId());
        res.setTitle(post.getTitle());
        res.setDescription(post.getDescription());
        res.setContent(post.getContent());

        return res;
    }
}
