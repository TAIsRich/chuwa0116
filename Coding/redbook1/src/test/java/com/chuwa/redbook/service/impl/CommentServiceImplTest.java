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
@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {


    private static final Logger logger= LoggerFactory.getLogger(CommentServiceImpl.class);

    @Mock
    private CommentRepository commentRepositoryMock;

    @Mock
    private PostRepository postRepositoryMock;
    @Mock
    private PostRepository postRepository;
    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private CommentServiceImpl commentService;
    @InjectMocks
    private PostServiceImpl postService;

    private CommentDto commentDto;

    private PostDto postDto;
    private Comment comment;
    private Post post;
    private Post post1;
    @BeforeEach
    void setup(){
        logger.info("set up Comment for each test");
        this.post=new Post(1L, "xiao ruishi", "wanqu", "wanqu xiaoruishi", LocalDateTime.now(),LocalDateTime.now());
        this.post1=new Post(2L, "xiao ruishi", "wanqu", "wanqu xiaoruishi", LocalDateTime.now(),LocalDateTime.now());
        this.comment=new Comment(1L,"Mason","yan.h@ufl.edu","Heyhey, It's ok ", LocalDateTime.now(),LocalDateTime.now());
        this.commentDto=modelMapper.map(this.comment,CommentDto.class);
        this.postDto=modelMapper.map(this.post,PostDto.class);
        this.comment.setPost(post);

    }

    @Test
    void createComment() {
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class))).thenReturn(comment);
        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        CommentDto commentResponse=commentService.createComment(post.getId(),commentDto);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(),commentResponse.getId());
        Assertions.assertEquals(commentDto.getBody(),commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(),commentResponse.getName());
    }

    @Test
    void getCommentsByPostId() {
        List<Comment> comments=new ArrayList<>();
        comments.add(comment);
        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong())).thenReturn(comments);

        List<CommentDto> commentDtos=commentService.getCommentsByPostId(1L);


        Assertions.assertNotNull(commentDtos);
        Assertions.assertEquals(1,commentDtos.size());

        CommentDto commentResponse=commentDtos.get(0);
        Assertions.assertEquals(commentDto.getId(),commentResponse.getId());
        Assertions.assertEquals(commentDto.getBody(),commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(),commentResponse.getName());

    }

    @Test
    void getCommentById() {


        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));


        CommentDto commentResponse=commentService.getCommentById(1L, 1L);

        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getId(),commentResponse.getId());
        Assertions.assertEquals(commentDto.getBody(),commentResponse.getBody());
        Assertions.assertEquals(commentDto.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getName(),commentResponse.getName());
    }

    @Test
    void updateComment() {
        String body="Update - " + comment.getBody();

        commentDto.setBody(body);

        Comment updatedComment=new Comment();
        updatedComment.setPost(comment.getPost());
        updatedComment.setEmail(comment.getEmail());
        updatedComment.setName(comment.getName());
        updatedComment.setId(comment.getId());

        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class))).thenReturn(updatedComment);


        CommentDto commentResponse=commentService.updateComment(1L,1L,commentDto);
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(updatedComment.getId(),commentResponse.getId());
        Assertions.assertEquals(updatedComment.getBody(),commentResponse.getBody());
        Assertions.assertEquals(updatedComment.getEmail(),commentResponse.getEmail());
        Assertions.assertEquals(updatedComment.getName(),commentResponse.getName());

    }

    @Test
    void deleteComment() {
        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));

        commentService.deleteComment(1L,1L);
        Mockito.verify(commentRepositoryMock,Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));
    }


    @Test
    void getCommentById_ResourceNotFoundException1(){
        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenThrow(new ResourceNotFoundException("Post", "id", 1L));
        Assertions.assertThrows(ResourceNotFoundException.class, () ->commentService.getCommentById(1L,1L));
    }

    @Test
    void getCommentById_ResourceNotFoundException2(){
        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenThrow(new ResourceNotFoundException("Comment", "id", 1L));
        Assertions.assertThrows(ResourceNotFoundException.class,() -> commentService.getCommentById(1L,1L));
    }

    @Test
    void getCommentById_BlogAPIException(){

        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post1));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
        Assertions.assertThrows(BlogAPIException.class,()->commentService.getCommentById(1L,1L));
    }


    @Test
    void updateComment_BlogAPIException(){
        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post1));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
        Assertions.assertThrows(BlogAPIException.class,()->commentService.updateComment(2L,1L,commentDto));
    }

    @Test
    void deleteComment_BlogAPIException(){
        Mockito.when(postRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(post1));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(comment));
        Assertions.assertThrows(BlogAPIException.class,()->commentService.deleteComment(2L,1L));
    }

}