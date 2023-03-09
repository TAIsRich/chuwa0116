package Coding.hw47Testing;

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
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class CommentServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    @Mock
    private CommentRepository commentRepositoryMock;

    @Mock
    private PostRepository postRepositoryMock;

    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private CommentServiceImpl commentService;
    private CommentDto commentDto;
    private Comment comment;

    private CommentDto commentDto2;
    private Comment comment2;

    private CommentDto updateCommentDto;
    private Comment updateComment;

    private Post post;

    private PostDto postDto;

    private Post post2;

    private PostDto postDto2;

    @BeforeAll
    static void beforeAll() {
        logger.info("START test");
    }

    @BeforeEach
    void setUp() {
        logger.info("set up Post for each test");

        this.post = new Post(2L, "postTitle", "postDesc", "postContent", null, null);
        this.postDto = modelMapper.map(this.post, PostDto.class);


        this.post2 = new Post(4L, "postTitle444", "postDesc444", "postContent444", null, null);
        this.postDto2 = modelMapper.map(this.post, PostDto.class);

        this.comment = new Comment(1L, "commentName", "comment@gmail.com", "exampleBody");
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);


        this.comment2 = new Comment(3L, "commentName222", "comment222@gmail.com", "exampleBody222");
        this.commentDto2 = modelMapper.map(this.comment2, CommentDto.class);

        updateComment = new Comment(4L, "updateCommentName", "updateCommentEmail@gmail.com", "updateCommentBody");
        updateCommentDto = modelMapper.map(updateComment, CommentDto.class);

        this.comment.setPost(this.post);
        this.comment2.setPost(this.post2);
        this.post.setComments(Set.of(this.comment));
        this.post2.setComments(Set.of(this.comment2));
    }

    @Test
    public void testCreateComment(){
        // define behavior
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));


        // execute
        CommentDto commentResp = commentService.createComment(post.getId(), commentDto);

        // assertions
        Assertions.assertNotNull(commentResp);
        Assertions.assertEquals(commentResp.getName(), commentDto.getName());
        Assertions.assertEquals(commentResp.getBody(), commentDto.getBody());
        Assertions.assertEquals(commentResp.getEmail(), commentDto.getEmail());
    }


    @Test
    public void testGetCommentsByPostId(){

        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
                .thenReturn(List.of(comment));

        List<CommentDto> lstCommentResp = commentService.getCommentsByPostId(1L);

        Assertions.assertTrue(lstCommentResp.size()>0);
        Assertions.assertNotNull(lstCommentResp.get(0));
        Assertions.assertEquals(lstCommentResp.get(0).getEmail(), commentDto.getEmail());
        Assertions.assertEquals(lstCommentResp.get(0).getName(), commentDto.getName());
        Assertions.assertEquals(lstCommentResp.get(0).getBody(), commentDto.getBody());
    }

    @Test
    public void testGetCommentById(){
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        CommentDto commentResp = commentService.getCommentById(2L,1L);

        Assertions.assertNotNull(commentResp);
        Assertions.assertEquals(commentResp.getEmail(), commentDto.getEmail());
        Assertions.assertEquals(commentResp.getName(), commentDto.getName());
        Assertions.assertEquals(commentResp.getBody(), commentDto.getBody());
    }

    @Test
    public void testGetCommentById_BlogAPIException(){
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment2));

        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Assertions.assertThrows(BlogAPIException.class, ()->commentService.getCommentById(1L, 3L));
    }


    @Test
    public void testDeleteComment(){
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                        .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                        .thenReturn(Optional.of(comment));

        Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));

        commentService.deleteComment(2L, 1L);
        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));

    }

    @Test
    public void testDeleteComment_BlogAPIException(){
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment2));

        Assertions.assertThrows(BlogAPIException.class, ()->commentService.deleteComment(1L, 3L));

    }


    @Test
    public void testUpdateComment() {
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);

        CommentDto commentResp = commentService.updateComment(2L, 1L, updateCommentDto);

        Assertions.assertNotNull(commentResp);
        Assertions.assertEquals(commentResp.getEmail(), updateCommentDto.getEmail());
        Assertions.assertEquals(commentResp.getName(), updateCommentDto.getName());
        Assertions.assertEquals(commentResp.getBody(), updateCommentDto.getBody());
    }

    @Test
    public void testUpdateComment_BlogAPIException(){
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment2));

        Assertions.assertThrows(BlogAPIException.class, ()->commentService.updateComment(1L, 3L, updateCommentDto));

    }





}
