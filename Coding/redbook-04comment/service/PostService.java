package Coding.redbook;

import com.chuwa.redbook.payload.PostDTO;

import java.util.List;

public interface PostService {
  PostDTO createPost(PostDTO postDTO);

  List<PostDTO> getAllPosts();

  PostDTO getPostById(long id);

  PostDTO updatePost(PostDTO postDto, long id);

  void deleteById(long id);


}
