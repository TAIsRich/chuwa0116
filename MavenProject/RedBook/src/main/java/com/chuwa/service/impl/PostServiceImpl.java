package com.chuwa.service.impl;

import com.chuwa.entity.Post;
import com.chuwa.exceptions.RecordNotFoundException;
import com.chuwa.payload.PostDto;
import com.chuwa.repository.PostRepository;
import com.chuwa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepository postRepository;
	@Override
	public PostDto createPost(PostDto postDto) {
		return mapToDTO(postRepository.save(mapToEntity(postDto)));
	}

	@Override
	public List<PostDto> getAllPost() {
		return postRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	@Override
	public PostDto getPostById(long id) {
		return mapToDTO(postRepository.findById(id).orElseThrow(()->new RecordNotFoundException("Post","id",id)));
	}

	@Override
	public PostDto updatePost(PostDto postDto, long id) {
		Post post = postRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Post", "id", id));
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		return mapToDTO(postRepository.save(post));
	}

	@Override
	public void deletePostById(long id) {
		postRepository.delete(postRepository.findById(id).orElseThrow(()->new RecordNotFoundException("Post","id",id)));
	}
	private PostDto mapToDTO(Post post) {
		PostDto postDto = new PostDto();
		postDto.setId(post.getId());
		postDto.setTitle(post.getTitle());
		postDto.setDescription(post.getDescription());
		postDto.setContent(post.getContent());
		return postDto;
	}

	private Post mapToEntity(PostDto postDto){
		Post post = new Post();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		return post;
	}
}
