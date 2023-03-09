package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.service.Impl.CommentServiceImpl;
import com.chuwa.redbook.service.Impl.PostServiceImpl;
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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zhipeng Yin
 * @date 2023-03-08 19:31
 */
@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    @Mock
    private CommentRepository commentRepositoryMock;

    @Mock
    private PostRepository postRepositoryMock;


    @InjectMocks
    private CommentServiceImpl commentService;

    @InjectMocks
    private PostServiceImpl postService;

    @Spy
    private ModelMapper modelMapper;

    private CommentDto commentDto;
    private Comment comment;
    private PostDto postDto;
    private Post post;

    @BeforeAll
    static void beforeAll() {
        logger.info("START test");
    }

    @BeforeEach
    void setUp() {
        logger.info("set up Post for each test");

        this.comment = new Comment(1L,"XiaoMing","xiaoming@gmail.com","This is a comment" );
        modelMapper = new ModelMapper();
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);
        this.post = new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        comment.setPost(post);
        this.postDto = modelMapper.map(this.post, PostDto.class);
    }



    @Test
    void createComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);

        CommentDto commentResponse =  commentService.createComment(1L,commentDto);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());

    }

    @Test
    void getCommentsByPostId() {
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);

        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
                .thenReturn(comments);

        List<CommentDto> commentDtos = commentService.getCommentsByPostId(1L);

        Assertions.assertNotNull(commentDtos);
        Assertions.assertEquals(1, commentDtos.size());
        CommentDto commentResponse = commentDtos.get(0);
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
    }

    @Test
    void getCommentById() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));


        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        CommentDto commentResponse = commentService.getCommentById(1L, 1L);


        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());

    }

    @Test
    void updateComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        commentService.deleteComment(1L, 1L);

        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));

    }

    @Test
    void deleteComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        commentService.deleteComment(1L, 1L);

        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));

    }
}