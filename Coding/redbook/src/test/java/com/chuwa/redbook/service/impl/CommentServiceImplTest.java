package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogApiException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.service.CommentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    @Mock
    private PostRepository postRepositoryMock;
    @Spy
    private ModelMapper modelMapper;
    @Mock
    private CommentRepository commentRepositoryMock;

    @InjectMocks
    private CommentServiceImpl commentService;


    private Post post;
    private PostDto postDto;
    private Comment comment;
    private CommentDto commentDto;
    private Comment commentNullPost;
    private CommentDto commentNullPostDto;

    @BeforeAll
    static void beforeAll() {
        logger.info("START test");
    }

    @BeforeEach
    void beforeEach() {
        logger.info("set up Post and Comment for each test");

        this.post = new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        this.comment = new Comment(1L, "tester", "test@gmail.com", "test is fun", this.post);
        this.commentNullPost = new Comment(1L, "tester", "test@gmail.com", "test is fun", null);
        ModelMapper modelMapper = new ModelMapper();
        this.postDto = modelMapper.map(this.post, PostDto.class);
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);
        this.commentNullPostDto = modelMapper.map(this.commentNullPost, CommentDto.class);
    }

    @Test
    void testCreateComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(commentNullPost);

        CommentDto commentResponse = commentService.createComment(1L, commentDto);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentResponse.getBody(), commentDto.getBody());
        Assertions.assertEquals(commentResponse.getEmail(), commentDto.getEmail());
        Assertions.assertEquals(commentResponse.getName(), commentDto.getName());
        Assertions.assertEquals(commentResponse.getId(), commentDto.getId());
    }

    @Test
    void testGetCommentByPostId() {
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);

        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comments));

        List<CommentDto> list = commentService.getCommentByPostId(1L);

        Assertions.assertNotNull(list);
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(commentDto.getId(), list.get(0).getId());
        Assertions.assertEquals(commentDto.getEmail(), list.get(0).getEmail());
        Assertions.assertEquals(commentDto.getName(), list.get(0).getName());
        Assertions.assertEquals(commentDto.getBody(), list.get(0).getBody());
    }

    @Test
    void testGetCommentById() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        CommentDto commentResponse = commentService.getCommentById(1L, 1L);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentResponse.getBody(), commentDto.getBody());
        Assertions.assertEquals(commentResponse.getEmail(), commentDto.getEmail());
        Assertions.assertEquals(commentResponse.getName(), commentDto.getName());
        Assertions.assertEquals(commentResponse.getId(), commentDto.getId());
    }

    @Test
    void testGetCommentById_BlogApiException() {
        Post antherPost = new Post();
        post.setId(2L);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(antherPost));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        Assertions.assertThrows(BlogApiException.class, () -> commentService.getCommentById(1L, 1L));
    }

    @Test
    void testUpdateComment() {
        Comment updatedComment = new Comment();
        updatedComment.setBody("this is for update test");
        updatedComment.setEmail("test.update@gmail.com");
        updatedComment.setName("test update");
        updatedComment.setPost(comment.getPost());
        updatedComment.setId(comment.getId());
        ModelMapper mapper = new ModelMapper();
        CommentDto updatedCommentDto = mapper.map(updatedComment, CommentDto.class);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(updatedComment);

        CommentDto commentResponse = commentService.updateComment(1L, 1L, updatedCommentDto);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentResponse.getBody(), updatedCommentDto.getBody());
        Assertions.assertEquals(commentResponse.getEmail(), updatedCommentDto.getEmail());
        Assertions.assertEquals(commentResponse.getName(), updatedCommentDto.getName());
        Assertions.assertEquals(commentResponse.getId(), updatedCommentDto.getId());
    }

    @Test
    void testUpdateComment_BlogApiException() {
//        Comment updatedComment = new Comment();
//        updatedComment.setBody("this is for update test");
//        updatedComment.setEmail("test.update@gmail.com");
//        updatedComment.setName("test update");
//        updatedComment.setPost(comment.getPost());
//        updatedComment.setId(comment.getId());
//        ModelMapper mapper = new ModelMapper();
//        CommentDto updatedCommentDto = mapper.map(updatedComment, CommentDto.class);

        Post antherPost = new Post();
        post.setId(2L);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(antherPost));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
//        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
//                .thenReturn(updatedComment);

        Assertions.assertThrows(BlogApiException.class, () -> commentService.updateComment(1L, 1L, null));
    }

    @Test
    void testDeleteComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.doNothing().when(commentRepositoryMock).deleteById(ArgumentMatchers.anyLong());

        commentService.deleteComment(1L, 1L);

        Mockito.verify(commentRepositoryMock, Mockito.times(1)).deleteById(ArgumentMatchers.anyLong());
    }

    @Test
    void testDeleteComment_BlogApiException() {
        Post antherPost = new Post();
        post.setId(2L);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(antherPost));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
//        Mockito.doNothing().when(commentRepositoryMock).deleteById(ArgumentMatchers.anyLong());

        Assertions.assertThrows(BlogApiException.class, () -> commentService.deleteComment(1L, 1L));
    }
}
