package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
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
import org.springframework.http.HttpStatus;
import org.springframework.security.core.parameters.P;
import springfox.documentation.schema.ModelKey;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)

 class CommentServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(PostServiceImplTest.class);
    @Mock
    private CommentRepository commentRepositoryMock;
    @Mock
    private PostRepository postRepositoryMock;
    @Spy
    private ModelMapper modelMapper;
    @InjectMocks
    private CommentServiceImpl commentService;
    @InjectMocks
    private PostServiceImpl postService;

    private CommentDto commentDto;
//    @Mock
     private Comment comment;
    private PostDto postDto;
//    @Mock
     private Post post;

    @BeforeAll
    static void beforeAll() {
        logger.info("START test");
    }
    @BeforeEach
    void setUp() {
        logger.info("set up Post for each test");
        logger.info("set up Comment for each test");

        this.comment = new Comment(1L, "testName", "testEmail", "testBody");
        ModelMapper modelMapper = new ModelMapper();
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);
        this.post = new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
                LocalDateTime.now(), LocalDateTime.now());
        this.postDto = modelMapper.map(this.post, PostDto.class);
        comment.setPost(post);
    }
    @Test
    public void testCreateComment(){
//        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(Post.class));
//        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
//                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        CommentDto commentResponse=commentService.createComment(1L,commentDto);
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(),commentResponse.getId());
        Assertions.assertEquals(commentDto.getBody(),commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(),commentResponse.getName());
    }
    @Test
    public void testCreateComment_ResourceNotFoundException(){
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> postService.getPostById(1L));
    }
//    @Mock
//    Comment testComment=new Comment(1L, "testName", "testEmail", "testBody");
//    @Mock
//    Post testPost=new Post(1L, "xiao ruishi", "wanqu", "wanqu xiao ruishi",
//            LocalDateTime.now(), LocalDateTime.now());
    @Test
    public void testGetCommentById(){
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));

//        Mockito.when(comment.getPost()).thenReturn(post);
//        Mockito.when(testPost.getId()).thenReturn(testPost);
        CommentDto commentResponse=commentService.getCommentById(1L,1L);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(),commentResponse.getId());
        Assertions.assertEquals(commentDto.getBody(),commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(),commentResponse.getName());


    }
    @Test
    public void testGetCommentById_ResourceNotFoundException(){


        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.getCommentById(1L,1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> postService.getPostById(1L));
    }

    @Test
    public void testGetCommentById_BlogAPIException() throws BlogAPIException {
//        post.setId(222L);
        comment.getPost().setId(222L);
//        post.setId(222L);
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
//        if(post)
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()).get().getPost().getId()
                !=postRepositoryMock.findById(ArgumentMatchers.anyLong()).get().getId()).
                thenThrow(new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post!!!"));

//        CommentDto commentResponse=commentService.getCommentById(1L,2L);
        Assertions.assertThrows(BlogAPIException.class, () ->{
            commentService.getCommentById(1L,2L);
                }

        );
        comment.getPost().setId(1L);

    }
    @Test
    public void testGetCommentsByPostId(){
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);
        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong())).thenReturn(comments);
//        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));

       List<CommentDto> commentResponse =commentService.getCommentsByPostId(post.getId());
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(1, commentResponse.size());
        CommentDto cmt = commentResponse.get(0);
        Assertions.assertEquals(commentDto.getId(),cmt.getId());
        Assertions.assertEquals(commentDto.getBody(),cmt.getBody());
        Assertions.assertEquals(commentDto.getEmail(),cmt.getEmail());
        Assertions.assertEquals(commentDto.getName(),cmt.getName());

    }
//    @Test
//    public void testGetCommentsById_ResourceNotFoundException(){
//
//
//    }
    @Test
    public void testUpdateComment(){
        Comment updatedComment = new Comment();
        updatedComment.setId(comment.getId());
        updatedComment.setBody(comment.getBody());
        updatedComment.setEmail(comment.getEmail());
        updatedComment.setName(comment.getName());
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class))).thenReturn(updatedComment);

        CommentDto commentResponse=commentService.updateComment(post.getId(),comment.getId(),commentDto);
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(),commentResponse.getId());
        Assertions.assertEquals(commentDto.getBody(),commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(),commentResponse.getName());

    }
    @Test
    public void testUpdateComment_BlogAPIException() throws BlogAPIException {
//        post.setId(222L);
        comment.getPost().setId(222L);
//        post.setId(222L);
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
//        if(post)
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()).get().getPost().getId()
                        !=postRepositoryMock.findById(ArgumentMatchers.anyLong()).get().getId()).
                thenThrow(new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post!!!!!!"));

//        CommentDto commentResponse=commentService.updateComment(1L,2L,commentDto);
        Assertions.assertThrows(BlogAPIException.class, () ->{
                    commentService.getCommentById(1L,2L);
                }

        );
        comment.getPost().setId(1L);

    }
    @Test
    public void TestUpdateComment_ResourceNotFoundException(){
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.getCommentById(1L,1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> postService.getPostById(1L));

    }
    @Test
    public void testDeleteComment(){
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));
        commentService.deleteComment(post.getId(),comment.getId());
        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));
    }
    @Test
    public void testDeleteComment_ResourceNotFoundException(){
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.getCommentById(1L,1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> postService.getPostById(1L));
    }
    @Test
    public void testDeleteComment_BlogAPIException(){
        comment.getPost().setId(222L);
//        post.setId(222L);
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
//        if(post)
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()).get().getPost().getId()
                        !=postRepositoryMock.findById(ArgumentMatchers.anyLong()).get().getId()).
                thenThrow(new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post!!!!!!"));

//       commentService.deleteComment(1L,2L);
        Assertions.assertThrows(BlogAPIException.class, () ->{
                    commentService.getCommentById(1L,2L);
                }

        );
        comment.getPost().setId(1L);
    }

//    @Test
//    public  void TestGetCommentsByPostId(){
//
//    }
//    @Test
//    public void TestGetCommentsByPostId_ResourceNotFoundException(){
//
//    }

}
