package com.chuwa.redbook.service.impl;


import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    /**
     * 创建一个Mock对象
     * 也可以通过PostRepository postRepository = Mockito.mock(PostRepository.class)
     * 区别是， @Mock这种方式会被@InjectMocks识别，并注入给该变量
     */
    @Mock
    private PostRepository postRepositoryMock;

    @Mock
    private CommentRepository commentRepositoryMock;

    /**
     * 未定义的方法（behavior），则调用真实的方法。
     * 已定义的方法when().thenReturn(), 则调用mock的虚假behavior。
     */
    @Spy
    private ModelMapper modelMapper;

    /**
     * 为该class依赖的变量，注入对应的Mock对象。
     * 比如PostServiceImpl依赖postRepository 和modelMapper,则将上面@Mock和@Spy修饰的注入进来
     */
    @InjectMocks
    private CommentServiceImpl commentService;

    @InjectMocks
    private PostServiceImpl postService;

    /**
     * 定义两个fields
     */

    private CommentDto commentDto;

    private Comment comment;

    private PostDto postDto;
    private Post post;

    @BeforeAll
    static void beforeAll() {logger.info("START test");}

    @BeforeEach
    //post需要添加一个comment
    void setUp() {
        logger.info("set up Comment for each test");

        this.post = new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        ModelMapper modelMapper = new ModelMapper();
        this.postDto = modelMapper.map(this.post, PostDto.class);



        this.comment = new Comment(1L, "tom", "tom@gmail.com", "this is a comment from tom");
        comment.setPost(post);
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);
    }


    @Test
    void testCreateComment() {
        //define the behaviors
        //comment和post有依赖, 先根据id找到post, 然后在创建comment
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class))).thenReturn(comment);
//        Mockito.when(postRepositoryMock.save(ArgumentMatchers.any(Post.class)))
//                .thenReturn(post);

        //execute
        CommentDto commentResponse = commentService.createComment(1L ,commentDto);

        //assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
    }

    @Test
    void testGetCommentsByPostId() {
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);
        // define the behaviors
        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
                        .thenReturn(comments);

        // execute
        List<CommentDto> commentResponses = commentService.getCommentsByPostId(1L);
        CommentDto commentResponse = commentResponses.get(0);

        // assertions
        Assertions.assertNotNull(commentResponse);

        /*
        不可以这样写 Assertions.assertEquals(comments.get(0), commentResponse.get(0));
        org.opentest4j.AssertionFailedError:
        Expected :Comment{id=1, name='tom', email='tom@gmail.com', body='this is a comment from tom'}
        Actual   :CommentDto{id=1, name='tom', email='tom@gmail.com', body='this is a comment from tom'}
        应该吧里面的东西取出来比较
        */

        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());

    }

    @Test
    void testGetCommentById() {

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        CommentDto commentResponse = commentService.getCommentById(1L, 1L);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
    }

    @Test

    void testGetCommentById_BlogAPIException() {
        //需要加个post 让他有东西throw
        Post post = new Post(2L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        Assertions.assertThrows( BlogAPIException.class, () -> commentService.getCommentById(1L, 1L));
    }


    @Test
    void testUpdateComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        String body = "UPDATED -" + comment.getBody();
        commentDto.setBody(body);

        //deep copy
        Comment updatedComment = new Comment();
        updatedComment.setId(comment.getId());
        updatedComment.setBody(body);
        updatedComment.setName(comment.getName());
        updatedComment.setEmail(comment.getEmail());
        updatedComment.setPost(comment.getPost());

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(updatedComment);

        //exe
        CommentDto commentResponse = commentService.updateComment(1L, 1L, commentDto);

        //ass
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());

    }

    @Test
    void testUpdateComment_BlogAPIException() {
        Post post = new Post(2L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        Assertions.assertThrows(BlogAPIException.class, () -> commentService.updateComment(1L, 1L, commentDto));
    }

    @Test
    void testDeleteComment() {
        //define
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        //deleteComment() is a void method
        Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));

        //exe
        commentService.deleteComment(1L, 1L);

        // verify
        // 验证 delete() 被执行过一次
        Mockito.verify(commentRepositoryMock, Mockito.times(1))
                .delete(ArgumentMatchers.any(Comment.class));

    }

    @Test
    void testDeleteComment_BlogAPIException() {
        Post post = new Post(2L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        Assertions.assertThrows(BlogAPIException.class, () -> commentService.deleteComment(1L, 1L));

    }
}