package com.example.cassandrablog.service.Impl;

import com.example.cassandrablog.dao.PostRepository;
import com.example.cassandrablog.entity.Post;
import com.example.cassandrablog.payload.PostDTO;
import com.example.cassandrablog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // 1. convert postDTO to Post
        Post post = new Post();

        // post.id is generated automatically
        post.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
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

    @Override
    public List<PostDTO> getPosts() {
        List<Post> postList = postRepository.findAll();
        List<PostDTO> posts = postList.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
        return posts;
    }

    private PostDTO mapToDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());

        return postDTO;
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO, Long id) {
        Post post = postRepository.findById(id).orElseThrow(RuntimeException::new);
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        Post updatePost = postRepository.save(post);
        return mapToDTO(updatePost);
    }

    @Override
    public void deletePostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(RuntimeException::new);
        postRepository.delete(post);
    }

//    @Override
//    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
//        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
//                : Sort.by(sortBy).descending();
//
//        // create pageable instance
//        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
//        Page<Post> pagePosts = postRepository.findAll(pageRequest);
//
//        // get content for page object
//        List<Post> posts = pagePosts.getContent();
//        List<PostDTO> postDTOs = posts.stream().map(this::mapToDTO).collect(Collectors.toList());
//
//        PostResponse postResponse = new PostResponse();
//        postResponse.setContent(postDTOs);
//        postResponse.setPageNo(pagePosts.getNumber());
//        postResponse.setPageSize(pagePosts.getSize());
//        postResponse.setTotalElements(pagePosts.getTotalElements());
//        postResponse.setTotalPages(pagePosts.getTotalPages());
//        postResponse.setLast(pagePosts.isLast());
//
//        return postResponse;
//    }
}
