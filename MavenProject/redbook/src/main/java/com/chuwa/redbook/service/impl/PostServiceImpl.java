package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public PostDto createPost(PostDto postDTO) {
        // 1. covert postDTO to Post
        Post post = postDTO.mapToPost();

        // 2. save Post to DB
        Post savedPost = postRepository.save(post);

        // 3. convert Post back to postDTO
        return new PostDto(savedPost);
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
            .map(PostDto::new)
            .collect(Collectors.toList());
    }

    @Override
    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())
            ? Sort.by(sortBy).ascending()
            : Sort.by(sortBy).descending();

        // create pageable instance
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
        Page<Post> postPages = postRepository.findAll(pageRequest);

        // get content for page object
        List<PostDto> postDtos = postPages.getContent().stream()
            .map(PostDto::new)
            .collect(Collectors.toList());

        return new PostResponse(postDtos, postPages);
    }

    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return new PostDto(post);
    }

    @Override
    public PostDto updatePostById(long id, PostDto postDTO) {
        Post post = postRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        Post updatedPost = postRepository.save(post);

        return new PostDto(updatedPost);
    }

    @Override
    public void deletePostById(long id) {
        Post post = postRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }

}
