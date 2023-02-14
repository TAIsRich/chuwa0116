package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostJPQLRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PostJPQLRepository postJPQLRepository;
    @Override
    public PostDTO createPost(PostDTO postDTO){
        //postDto to Post
        Post post=new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());

        //save Post to DB use repository
        Post savedPost=postRepository.save(post);
        PostDTO response=new PostDTO();
        response.setId(savedPost.getId());
        response.setTitle(savedPost.getTitle());
        response.setDescription(savedPost.getDescription());
        response.setContent(savedPost.getContent());

        return  response;
    }
    private Post mapToEntity(PostDTO postDTO){
        Post post=new Post();
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        post.setDescription(postDTO.getDescription());
        return post;


    }

    private PostDTO mapToDTO(Post post){
        PostDTO postDTO=new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setContent(post.getContent());
        postDTO.setDescription(post.getDescription());
        postDTO.setTitle(post.getContent());
        return postDTO;

    }

    @Override
    public List<PostDTO> getAllPosts(){
        List<Post>Posts=postRepository.findAll();
        List<PostDTO>PostDTOs=Posts.stream().map(post->mapToDTO(post)).collect(Collectors.toList());
        return PostDTOs;
    }
    @Override
    public PostDTO getPostById(long id){
//        Post post=postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException(("Post","id",id));
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return mapToDTO(post);
    }

    @Override
    public PostDTO updatePost(PostDTO postDTO,long id){
        Post post=postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        Post updatePost = postRepository.save(post);
        return mapToDTO(updatePost);

    }
    @Override
    public void deletePostById(long id){
        Post post=postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));
        postRepository.delete(post);
    }
//    @Override
//    public PostResponse getAllPosts(int pageNo,int pageSize,String sortBy,String sortDir){
//        Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
//        PageRequest pageRequest=PageRequest.of(pageNo,pageSize,sort);
//        Page<Post>pagePosts=postRepository.findAll(pageRequest);
//        List<Post>posts=pagePosts.getContent();
//        List<PostDTO>postDtos=posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
//        PostResponse postResponse=new PostResponse();
//        postResponse.setContent(postDtos);
//        postResponse.setPageNo(pagePosts.getNumber());
//        postResponse.setPageSize(pagePosts.getSize());
//        postResponse.setTotalElements(pagePosts.getTotalElements());
//        postResponse.setTotalPages(pagePosts.getTotalPages());
//        postResponse.setLast(pagePosts.isLast());
//        return postResponse;
    @Override
    public List<PostDTO>getAllPostWithJPQL(){
        return postJPQLRepository.getAllPostWithJPQL().stream().map(post->mapToDTO(post)).collect(Collectors.toList());

    }
    @Override
    public PostDTO getPostByIdJPQLIndexParameter(Long id,String title){
        Post post=postRepository.getPostByIdOrTitleWithJPQLIndexedParameters(id,title);
        return mapToDTO(post);
    }
    @Override
    public PostDTO getPostByIdJPQLNamedParameter(Long id,String title){
        Post post = postRepository.getPostByIdOrTitleWithJPQLNamedParameters(id, title);
        return mapToDTO(post);
    }
    @Override
    public PostDTO getPostByIdSQLNamedParameter(Long id,String title){
        Post post=postRepository.getPostByIdOrTitleWithSQLNamedParameters(id,title);
        return mapToDTO(post);
    }
    @Override
    public PostDTO getPostByIdSQLIndexParameter(Long id,String title){
        Post post=postRepository.getPostByIdOrTitleWithSQLIndexedParameters(id,title);
        return mapToDTO(post);
    }


}
