package com.chuwa.redbook.service.Impl;

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
public class PostServiceImpl implements PostService {


    @Autowired
    private PostRepository postRepository;


    @Autowired
    private ModelMapper modelMapper;


    @Override
    public PostDTO createPost(PostDTO postDTO){
        Post post=modelMapper.map(postDTO, Post.class);

        Post savedPost=postRepository.save(post);
        return modelMapper.map(savedPost,PostDTO.class);
    }

    @Override
    public PostResponse getAllpost(int pageNo, int pageSize, String sortBy, String sortDir){
        Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        PageRequest pageRequest = PageRequest.of(pageNo,pageSize,sort);
        Page<Post> pagePosts=postRepository.findAll(pageRequest);

        List<Post> posts=pagePosts.getContent();
        List<PostDTO> postDtos=posts.stream().map(post->modelMapper.map(post,PostDTO.class)).collect(Collectors.toList());
        PostResponse postResponse=new PostResponse();
        postResponse.setContent(postDtos);
        postResponse.setPageNo(postResponse.getPageNo());
        postResponse.setPageSize(postResponse.getPageSize());
        postResponse.setTotalPages(postResponse.getTotalPages());
        postResponse.setTotalPages(postResponse.getTotalPages());
        postResponse.setLast(postResponse.isLast());
        return postResponse;
    }

    @Override
    public List<PostDTO> getAllPost() {
        List<Post> posts = postRepository.findAll();
        List<PostDTO> postDtos = posts.stream().map(post -> modelMapper.map(post,PostDTO.class)).collect(Collectors.toList());
        return postDtos;
    }
    @Override
    public PostDTO getPostById(long id) {
//        Optional<Post> post = postRepository.findById(id);
//        post.orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

//        Post post = postRepository.findById(id).get();

        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        return mapToDTO(post);
    }


    @Override
    public PostDTO updatePost(PostDTO postDTO,long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        Post updatePost = postRepository.save(post);
        return mapToDTO(updatePost);
    }




    @Override
    public void deletePostById(long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new  ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }


    private  PostDTO mapToDTO(Post post){
        PostDTO postDTO=new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());

        return postDTO;
    }

}
