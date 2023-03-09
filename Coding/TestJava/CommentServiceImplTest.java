package com.chuwa.redbook.service.impl;


import cn.hutool.http.HttpException;
import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.platform.commons.logging.LoggerFactory;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

@ExtendWith(MockitoExtension.class)
public class CommentServiceImplTest {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(CommentServiceImplTest.class);
    @Mock
    private PostRepository postRepositoryMock;
    @Mock
    private CommentRepository commentRepositoryMock;

    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private CommentServiceImpl commentService;

    //field
    private CommentDto commentDto;
    private Comment comment;
    private PostDto postDto;
    private Post post;
    private Post post2;


    @BeforeAll
    static void beforeAll(){
        logger.info("Start test commentService");
    }

    @BeforeEach
    void setUp(){
        logger.info("set up Comment for each test");
/*
        this.comment = new Comment(1L, "name", "email", "bodyOfcomment");

        ModelMapper modelMapper = new ModelMapper();
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);
*/
        //for Post

        this.post = new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        this.post2 = new Post(2L, "newTitle", "newDescription", "newContent",
                LocalDateTime.now(), LocalDateTime.now());
        this.postDto = modelMapper.map(this.post, PostDto.class);
        //this.postDto = modelMapper.map(this.post2, PostDto.class)

        this.comment = new Comment(1L, "name", "email", "bodyOfcomment");
        comment.setPost(post);
        ModelMapper modelMapper = new ModelMapper();
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);

    }

    @Test
    public void testCreateComment(){
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        //execute
        CommentDto  commentResponse = commentService.createComment(1L, commentDto);
        //assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(), commentResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());

    }

    @Test
    public void testGetCommentByPostId(){
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);
        //define behaviors
        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
                .thenReturn(comments);
        //execute
        List<CommentDto> commentDtos = commentService.getCommentsByPostId(1L);

        //assertions
        Assertions.assertNotNull(commentDtos);
        Assertions.assertEquals(1, commentDtos.size());
        CommentDto commentResponse = commentDtos.get(0);
        Assertions.assertEquals(commentDto.getId(), commentResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
    }
    @Test
    public void testGetCommentById(){
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        //comment.setPost(post);
        //execute
        CommentDto commentResponse = commentService.getCommentById(1L, 1L);
        //assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(), commentResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
    }

    @Test
    public void testGetCommentById_PostIdNotEqualsInCommentException(){
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
               .thenReturn(Optional.of(post2));
        //execute
        Assertions.assertThrows(BlogAPIException.class, () -> commentService.getCommentById(2L, 1L));
    }

    @Test
    public void testUpdateComment(){
        String body = "UpdateComment-" + comment.getBody();
        commentDto.setBody(body);

        //deep copy
        Comment updatedComment = new Comment();
        updatedComment.setId(comment.getId());
        updatedComment.setName(comment.getName());
        updatedComment.setBody(body);
        updatedComment.setEmail(comment.getEmail());

        //define the behaviors
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(updatedComment);
        //execute
        CommentDto commentResponse = commentService.updateComment(1L, 1L, commentDto);

        //assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());

    }

    @Test
    public void testUpdateComment_PostIdNotEqualsInCommentException(){
        String body = "UpdateComment-" + comment.getBody();
        commentDto.setBody(body);

        //deep copy
        Comment updatedComment = new Comment();
        updatedComment.setId(comment.getId());
        updatedComment.setName(comment.getName());
        updatedComment.setBody(body);
        updatedComment.setEmail(comment.getEmail());

        //define the behaviors
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post2));
        //the following statement should not be added!!
       // Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
       //         .thenReturn(updatedComment);

        //assertions
        Assertions.assertThrows(BlogAPIException.class, () -> commentService.updateComment(2L, 1L, commentDto));

    }

    @Test void testDeleteComment(){
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));

        //execute
        commentService.deleteComment(1L, 1L);

        //verify
        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));

    }

    @Test void testDeleteComment_PostIdNotEqualsInCommentException(){
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post2));
        //Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));

        //assertion
        Assertions.assertThrows(BlogAPIException.class, () -> commentService.deleteComment(2L, 1L));
    }
}
