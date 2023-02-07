package com.chuwa.service.impl;

import com.chuwa.entity.Post;
import com.chuwa.exceptions.RecordNotFoundException;
import com.chuwa.payload.PostDto;
import com.chuwa.payload.PostResponse;
import com.chuwa.repository.PostRepository;
import com.chuwa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
				: Sort.by(sortBy).descending();
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
		Page<Post> pagePosts = postRepository.findAll(pageRequest);
		List<Post> posts = pagePosts.getContent();
		List<PostDto> postDtos = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
		PostResponse postResponse = new PostResponse();
		postResponse.setContent(postDtos);
		postResponse.setPageNo(pagePosts.getNumber());
		postResponse.setPageSize(pagePosts.getSize());
		postResponse.setTotalElements(pagePosts.getTotalElements());
		postResponse.setTotalPages(pagePosts.getTotalPages());
		postResponse.setLast(pagePosts.isLast());
		return postResponse;
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
