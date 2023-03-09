package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.payload.CommentDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Function:
 *
 * @author haoyu
 * @Date 3/8/23
 */
@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    @Mock
    private PostRepository postRepositoryMock;

    @Mock
    private CommentRepository commentRepositoryMock;

    @InjectMocks
    private CommentServiceImpl commentService;

    private CommentDto commentDto;
    private Comment comment;
    private Post post;

    @BeforeAll
    static void beforeAll() {
        logger.info("Start test");
    }

    @BeforeEach
    void setUp() {
        logger.info("Set up commentDto for each test");
        this.post = new Post(1L, "dalufandian", "dajiadoulaizhu", "woyejingchanglai",
            LocalDateTime.now(), LocalDateTime.now());

        this.comment = new Comment(1L, "John Wick",
            "killer@gmail.com", "nice place");
        comment.setPost(this.post);

        this.commentDto = new CommentDto(comment);
    }

    @Test
    void testCreateComment() {
        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
            .thenReturn(comment);

        // execute
        CommentDto commentDtoResponse = commentService.createComment(1L, commentDto);

        // assertions
        Assertions.assertNotNull(commentDtoResponse);
        Assertions.assertEquals(commentDto.getId(), commentDtoResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentDtoResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentDtoResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentDtoResponse.getBody());
    }

    @Test
    void testGetCommentsByPostId() {
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);

        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
            .thenReturn(comments);

        List<CommentDto> commentDtos = commentService.getCommentsByPostId(1L);

        Assertions.assertNotNull(commentDtos);
        Assertions.assertEquals(1, commentDtos.size());

        CommentDto commentDtoResponse = commentDtos.get(0);
        Assertions.assertEquals(commentDto.getId(), commentDtoResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentDtoResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentDtoResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentDtoResponse.getBody());
    }

    @Test
    void testGetCommentById() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.ofNullable(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.ofNullable(comment));

        CommentDto commentDtoResponse = commentService.getCommentById(1L, 1L);

        Assertions.assertThrows(BlogAPIException.class,
            () -> commentService.getCommentById(2L, 1L));
        Assertions.assertEquals(commentDto.getId(), commentDtoResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentDtoResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentDtoResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentDtoResponse.getBody());
    }

    @Test
    void testUpdateCommentById() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.ofNullable(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.ofNullable(comment));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
            .thenReturn(comment);

        CommentDto commentDtoResponse = commentService.updateCommentById(1L, 1L, commentDto);

        Assertions.assertThrows(BlogAPIException.class,
            () -> commentService.updateCommentById(2L, 1L, commentDto));
        Assertions.assertEquals(commentDto.getId(), commentDtoResponse.getId());
        Assertions.assertEquals(commentDto.getName(), commentDtoResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentDtoResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentDtoResponse.getBody());
    }

    @Test
    void deleteCommentById() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.ofNullable(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
            .thenReturn(Optional.ofNullable(comment));

        Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));

        commentService.deleteCommentById(1L, 1L);

        Mockito.verify(commentRepositoryMock,
            Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));

        Assertions.assertThrows(BlogAPIException.class,
            () -> commentService.deleteCommentById(2L, 1L));
    }
}