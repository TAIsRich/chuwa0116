package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;
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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author b1go
 * @date 9/16/22 12:31 AM
 */
@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    /**
     * 创建一个Mock对象
     * 也可以通过PostRepository postRepository = Mockito.mock(PostRepository.class)
     * 区别是， @Mock这种方式会被@InjectMocks识别，并注入给该变量
     */
    @Mock
    private CommentRepository commentRepositoryMock;

    @Mock
    private PostRepository postRepositoryMock;

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

    /**
     * 定义两个fields
     */
    private CommentDto commentDto;
    private Comment comment;
    private Post post;


    @BeforeAll
    static void beforeAll() {
        logger.info("START test");
    }

    @BeforeEach
    void setUp() {
        logger.info("set up Comment for each test");

        post = new Post(11L, "post title", "post description", "post content", LocalDateTime.now(), LocalDateTime.now());
        comment = new Comment( 1L, "comment test name", "test@comment.email.com", "comment body");
        modelMapper = new ModelMapper();
        commentDto = modelMapper.map(comment, CommentDto.class);

    }

    @Test
    public void testCreateComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);

        CommentDto res = commentService.createComment(1L, commentDto);

        Assertions.assertNotNull(res);
        Assertions.assertEquals(res.getId(), comment.getId());
        Assertions.assertEquals(res.getName(), comment.getName());
        Assertions.assertEquals(res.getEmail(), comment.getEmail());
        Assertions.assertEquals(res.getBody(), comment.getBody());
    }

    @Test
    public void testGetCommentsById(){
        comment.setPost(post);
        commentDto = modelMapper.map(comment, CommentDto.class);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(comment));



        CommentDto res = commentService.getCommentById(0L, 0L);
        Assertions.assertNotNull(res);
    }

    @Test
    public void testGetCommentsByPostId() {
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);

        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.any(Long.class)))
                .thenReturn(comments);

        List<CommentDto> res = commentService.getCommentsByPostId(1L);
        Assertions.assertNotNull(res);
        CommentDto firstComment = res.get(0);
        Assertions.assertEquals(firstComment.getId(), comment.getId());
        Assertions.assertEquals(firstComment.getName(), comment.getName());
        Assertions.assertEquals(firstComment.getEmail(), comment.getEmail());
        Assertions.assertEquals(firstComment.getBody(), comment.getBody());
    }

    @Test
    public void testGetCommentsById_BlogAPIException() {
        comment.setPost(post);
        commentDto = modelMapper.map(comment, CommentDto.class);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(new Post(2L, "title", "des", "content", LocalDateTime.now(), LocalDateTime.now())));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));


        Assertions.assertThrows(BlogAPIException.class, () -> commentService.getCommentById(0L,1L));
    }

    @Test
    public void testUpdateComment() {
        comment.setPost(post);
        commentDto = modelMapper.map(comment, CommentDto.class);

        String updateBody = "updated body";
        comment.setBody(updateBody);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(comment));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);

        CommentDto res = commentService.updateComment(1L, 1L, commentDto);
        Assertions.assertNotNull(res);
        Assertions.assertEquals(res.getBody(), comment.getBody());
    }

    @Test
    public void testUpdateComment_BlogAPIException() {
        comment.setPost(post);
        commentDto = modelMapper.map(comment, CommentDto.class);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(new Post(2L, "title", "des", "content", LocalDateTime.now(), LocalDateTime.now())));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));


        Assertions.assertThrows(BlogAPIException.class, () -> commentService.updateComment(0L,1L, commentDto));
    }

    @Test
    public void testDeleteComment() {
        comment.setPost(post);
        commentDto = modelMapper.map(comment, CommentDto.class);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(comment));

        Mockito.doNothing().when(commentRepositoryMock).delete(comment);
        commentService.deleteComment(1L, 1L);

        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));
    }

    @Test
    public void testDeleteComment_BlogAPIException() {
        comment.setPost(post);
        commentDto = modelMapper.map(comment, CommentDto.class);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(new Post(2L, "title", "des", "content", LocalDateTime.now(), LocalDateTime.now())));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));


        Assertions.assertThrows(BlogAPIException.class, () -> commentService.deleteComment(0L, 1L));
    }
}
