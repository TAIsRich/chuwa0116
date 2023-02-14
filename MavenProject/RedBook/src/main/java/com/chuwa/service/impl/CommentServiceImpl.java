package com.chuwa.service.impl;

import com.chuwa.entity.Comment;
import com.chuwa.entity.Post;
import com.chuwa.exceptions.BlogApiException;
import com.chuwa.exceptions.RecordNotFoundException;
import com.chuwa.payload.CommentDto;
import com.chuwa.repository.CommentRepository;
import com.chuwa.repository.PostRepository;
import com.chuwa.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public CommentDto createComment(long postId, CommentDto commentDto) {
		Comment comment = mapToEntity(commentDto);
		Post post = postRepository.findById(postId)
				.orElseThrow(() -> new RecordNotFoundException("Post", "id", postId));
		comment.setPost(post);
		Comment savedComment = commentRepository.save(comment);
		return mapToDto(savedComment);
	}

	@Override
	public List<CommentDto> getCommentsByPostId(long postId) {
		List<Comment> comments = commentRepository.findByPostId(postId);
		return comments.stream().map(comment -> mapToDto(comment)).collect(Collectors.toList());
	}

	@Override
	public CommentDto getCommentById(Long postId, Long commentId) {
		Post post = postRepository.findById(postId)
				.orElseThrow(() -> new RecordNotFoundException("Post", "id", postId));
		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new RecordNotFoundException("Comment", "id", commentId));
		if (!comment.getPost().getId().equals(post.getId())) {
			throw new BlogApiException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
		}
		return mapToDto(comment);
	}

	@Override
	public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDtoRequest) {
		Post post = postRepository.findById(postId)
				.orElseThrow(() -> new RecordNotFoundException("Post", "id", postId));
		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new RecordNotFoundException("Comment", "id", commentId));
		if (!comment.getPost().getId().equals(post.getId())) {
			throw new BlogApiException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
		}
		comment.setName(commentDtoRequest.getName());
		comment.setEmail(commentDtoRequest.getEmail());
		comment.setBody(commentDtoRequest.getBody());
		Comment updatedComment = commentRepository.save(comment);
		return mapToDto(updatedComment);
	}

	@Override
	public void deleteComment(Long postId, Long commentId) {
		Post post = postRepository.findById(postId)
				.orElseThrow(() -> new RecordNotFoundException("Post", "id", postId));
		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new RecordNotFoundException("Comment", "id", commentId));
		if (!comment.getPost().getId().equals(post.getId())) {
			throw new BlogApiException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
		}
		commentRepository.delete(comment);
	}

	private CommentDto mapToDto(Comment comment) {
		CommentDto commentDto = new CommentDto();
		commentDto.setId(comment.getId());
		commentDto.setName(comment.getName());
		commentDto.setEmail(comment.getEmail());
		commentDto.setBody(comment.getBody());
		return commentDto;
	}

	private Comment mapToEntity(CommentDto commentDto) {
		Comment comment = new Comment();
		comment.setId(commentDto.getId());
		comment.setName(commentDto.getName());
		comment.setEmail(commentDto.getEmail());
		comment.setBody(commentDto.getBody());
		return comment;
	}
}

