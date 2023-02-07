package com.example.redbook.service.Impl;

import com.example.redbook.dao.PostRepository;
import com.example.redbook.entity.Post;
import com.example.redbook.payload.PostDTO;
import com.example.redbook.payload.PostResponse;
import com.example.redbook.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    @Override
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();

        // create pageable instance

        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
//        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
//        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());
        Page<Post> pagePosts = postRepository.findAll(pageRequest);

        // get content for page abject
        List<Post> posts = pagePosts.getContent();
        List<PostDTO> postDtos = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDtos);
        postResponse.setPageNo(pagePosts.getNumber());
        postResponse.setPageSize(pagePosts.getSize());
        postResponse.setTotalElements(pagePosts.getTotalElements());
        postResponse.setTotalPages(pagePosts.getTotalPages());
        postResponse.setLast(pagePosts.isLast());
        return postResponse;
    }
}
