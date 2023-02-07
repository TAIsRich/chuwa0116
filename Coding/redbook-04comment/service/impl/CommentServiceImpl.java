package Coding.redbook;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDTO;
import com.chuwa.redbook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  private PostRepository postRepository;

  @Autowired
  private CommentRepository commentRepository;


  @Override
  public CommentDTO createComment(long postId, CommentDTO commentDto) {
    Comment comment = mapToEntity(commentDto);
    Post post = postRepository.findById(postId)
        .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
    comment.setPost(post);

    Comment savedComment = commentRepository.save(comment);
    return mapToDto(savedComment);

  }

  @Override
  public List<CommentDTO> getCommentsByPostId(long postId) {
    // error throw here?
    List<Comment> comments = commentRepository.findByPostId(postId);
    return comments.stream().map(this::mapToDto).collect(Collectors.toList());

  }

  @Override
  public CommentDTO getCommentById(Long postId, Long commentId) {
//    List<Comment> comments = commentRepository.findByPostId(postId);
//    comments.stream().filter(c->commentId.equals(c.getId())).
    Post post = postRepository.findById(postId)
        .orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));

    Comment comment = commentRepository.findById(commentId)
        .orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));

    if (!comment.getPost().getId().equals(post.getId())){
      throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
    }
    return mapToDto(comment);
  }

  @Override
  public CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDtoRequest) {
    Post post = postRepository.findById(postId)
        .orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));

    Comment comment = commentRepository.findById(commentId)
        .orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));

    if (!comment.getPost().getId().equals(post.getId())){
      throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
    }

    comment.setName(commentDtoRequest.getName());
    comment.setEmail(commentDtoRequest.getEmail());
    comment.setBody(commentDtoRequest.getBody());

    Comment savedComment = commentRepository.save(comment);

    return mapToDto(savedComment);
  }

  @Override
  public void deleteComment(Long postId, Long commentId) {
    Post post = postRepository.findById(postId)
        .orElseThrow(()->new ResourceNotFoundException("Post", "id", postId));

    Comment comment = commentRepository.findById(commentId)
        .orElseThrow(()->new ResourceNotFoundException("Comment", "id", commentId));

    if (!comment.getPost().getId().equals(post.getId())){
      throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
    }

    commentRepository.delete(comment);
  }

  private CommentDTO mapToDto(Comment comment){
    CommentDTO commentDto = new CommentDTO();
    commentDto.setId(comment.getId());
    commentDto.setName(comment.getName());
    commentDto.setEmail(comment.getEmail());
    commentDto.setBody(comment.getBody());
    return commentDto;
  }

  private Comment mapToEntity(CommentDTO commentDto){
    Comment comment = new Comment();
    comment.setId(commentDto.getId());
    comment.setName(commentDto.getName());
    comment.setEmail(commentDto.getEmail());
    comment.setBody(commentDto.getBody());
    return comment;
  }

}
