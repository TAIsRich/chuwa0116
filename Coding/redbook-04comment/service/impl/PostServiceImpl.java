package Coding.redbook;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepository postRepository;

  @Override
  public PostDTO createPost(PostDTO postDto){
    // 1 convert postDTo to Post
//    Post post = new Post();
//    // post.setId(); auto increment, no need to set id here
//    post.setTitle(postDto.getTitle());
//    post.setDescription(postDto.getDescription());
//    post.setContent(postDto.getContent());

    Post post = mapToEntity(postDto);
    // 2 save Post to DB
    Post savedPost = postRepository.save(post);

    // 3 convert Post back to postDTO
//    PostDTO resp = new PostDTO();
//    resp.setId(savedPost.getId());
//    resp.setTitle(savedPost.getTitle());
//    resp.setDescription(savedPost.getDescription());
//    resp.setContent(savedPost.getContent());

    PostDTO resp = mapToDTO(savedPost);
    return resp;

  }

  @Override
  public List<PostDTO> getAllPosts() {
    List<Post> lst = postRepository.findAll();
//    System.out.println(lst);
    return lst.stream()
        .map(p -> mapToDTO(p))
        .collect(Collectors.toList());

  }

  @Override
  public PostDTO getPostById(long id){
    Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post id", "ID", id));
    return mapToDTO(post);
  }

  @Override
  public PostDTO updatePost(PostDTO postDto, long id){
    Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post id", "ID", id));
    post.setTitle(postDto.getTitle());
    post.setDescription(postDto.getDescription());
    post.setContent(postDto.getContent());

    Post updatedPost = postRepository.save(post);
    return mapToDTO(updatedPost);
  }

  @Override
  public void deleteById(long id) {
    Post post = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post id", "ID", id));
    postRepository.delete(post);
  }

  private PostDTO mapToDTO(Post post){
    PostDTO res = new PostDTO();
    res.setTitle(post.getTitle());
    res.setDescription(post.getDescription());
    res.setContent(post.getContent());
    res.setId(post.getId());
    return res;
  }

  private Post mapToEntity(PostDTO postDto){
    Post res = new Post();
    res.setContent(postDto.getContent());
    res.setDescription(postDto.getDescription());
    res.setTitle(postDto.getTitle());
    return res;
  }
}
