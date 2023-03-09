package com.chuwa.service.impl;

import com.chuwa.entity.Comment;
import com.chuwa.entity.Post;
import com.chuwa.exceptions.BlogApiException;
import com.chuwa.payload.CommentDto;
import com.chuwa.repository.CommentRepository;
import com.chuwa.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class CommentServiceImplTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentServiceImplTest.class);
    @InjectMocks
    private CommentServiceImpl commentService;
	@Mock
	private CommentRepository commentRepository;
	@Mock
	private PostRepository postRepository;
	private Comment comment;
	private CommentDto commentDto;
	private Post post,post1;
    @BeforeAll
    static void beforeAll(){
		LOGGER.info(()->"Start testing");
    }
	@BeforeEach
	void setUp(){
		this.post = new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
				LocalDateTime.now(), LocalDateTime.now());
		this.post1 = new Post(2L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
				LocalDateTime.now(), LocalDateTime.now());
		this.comment = new Comment(1L,"randomComment","2008202@qq.com","Wonderful!",this.post,LocalDateTime.now(),LocalDateTime.now());
		ModelMapper modelMapper = new ModelMapper();
		this.commentDto = modelMapper.map(this.comment,CommentDto.class);
	}
	@Test
	public void testCreateComment() {
		Mockito.when(commentRepository.save(ArgumentMatchers.any(Comment.class))).thenReturn(this.comment);
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
		CommentDto commentDto = commentService.createComment(1L,this.commentDto);
		Assertions.assertNotNull(commentDto);
		Assertions.assertEquals(commentDto.getBody(),this.commentDto.getBody());
		Assertions.assertEquals(commentDto.getId(),this.commentDto.getId());
		Assertions.assertEquals(commentDto.getEmail(),this.commentDto.getEmail());
		Assertions.assertEquals(commentDto.getName(),this.commentDto.getName());
	}

	@Test
	public void getCommentsByPostId() {
		Mockito.when(commentRepository.findByPostId(ArgumentMatchers.anyLong())).thenReturn(List.of(this.comment));
		List<CommentDto> commentsByPostId = commentService.getCommentsByPostId(1L);
		Assertions.assertNotNull(commentsByPostId);
		Assertions.assertEquals(commentsByPostId.get(0).getName(),commentDto.getName());
		Assertions.assertEquals(commentsByPostId.get(0).getEmail(),commentDto.getEmail());
		Assertions.assertEquals(commentsByPostId.get(0).getId(),commentDto.getId());
		Assertions.assertEquals(commentsByPostId.get(0).getBody(),commentDto.getBody());
	}

	@Test
	public void getCommentByIdThrowExceptions() {
		Mockito.when(commentRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post1));
		Assertions.assertThrows(BlogApiException.class,()->commentService.getCommentById(2L,2L));
	}

	@Test
	public void testGetCommentById() {
		Mockito.when(commentRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
		CommentDto commentById = commentService.getCommentById(1L, 1L);
		Assertions.assertNotNull(commentById);
		Assertions.assertEquals(commentById.getBody(),this.commentDto.getBody());
		Assertions.assertEquals(commentById.getEmail(),this.commentDto.getEmail());
		Assertions.assertEquals(commentById.getId(),this.commentDto.getId());
		Assertions.assertEquals(commentById.getName(),this.commentDto.getName());
	}

	@Test
	public void testUpdateCommentWithBlogApiException() {
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post1));
		Mockito.when(commentRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
		Assertions.assertThrows(BlogApiException.class,()->commentService.getCommentById(2L,2L));
	}

	@Test
	public void testUpdateComment() {
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
		Mockito.when(commentRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
		Mockito.when(commentRepository.save(ArgumentMatchers.any(Comment.class))).thenReturn(comment);
		CommentDto commentDto = commentService.updateComment(1L, 1L, this.commentDto);
		Assertions.assertNotNull(commentDto);
		Assertions.assertEquals(commentDto.getName(),this.commentDto.getName());
		Assertions.assertEquals(commentDto.getId(),this.commentDto.getId());
		Assertions.assertEquals(commentDto.getEmail(),this.commentDto.getEmail());
		Assertions.assertEquals(commentDto.getBody(),this.commentDto.getBody());
	}

	@Test
	public void testDeleteCommentWithBlogApiException() {
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post1));
		Mockito.when(commentRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
		Assertions.assertThrows(BlogApiException.class,()->commentService.deleteComment(2L,2L));
	}

	@Test
	public void testDeleteComment() {
		Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
		Mockito.when(commentRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
		commentService.deleteComment(1L,1L);
	}
}