package com.chuwa.redbook.controller;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.payload.PostDTO;
import com.chuwa.redbook.payload.PostResponse;
import com.chuwa.redbook.service.PostService;
import com.chuwa.redbook.util.AppConstraints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public ResponseEntity<PostDTO>savedPost(@RequestBody PostDTO postDTO){
        PostDTO postResponse=postService.createPost(postDTO);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
//    @GetMapping
//    public List<PostDTO> getAllPosts(){
//        return postService.getAllPosts();
//    }
    @GetMapping()
    public PostResponse getAllPosts(@RequestParam(value="pageNo",defaultValue = AppConstraints.DEFAULT_PAGE_NUMBER,required = false) int pageNo,
                                    @RequestParam(value="pageSize",defaultValue =AppConstraints.DEFAULT_PAGE_SIZE,required = false) int pageSize,
                                    @RequestParam(value="sortBy",defaultValue =AppConstraints.DEFAULT_SORT_BY,required = false) String sortBy,
                                    @RequestParam(value="sortDir",defaultValue=AppConstraints.DEFAULT_SORT_BY,required = false) String sortDir
                                    )
    {
    return postService.getAllPosts(pageNo,pageSize,sortBy,sortDir);

    }
    @GetMapping("/{id}")
    public ResponseEntity<PostDTO>getPostById(@PathVariable(name="id") long id){
        return  ResponseEntity.ok(postService.getPostById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<PostDTO>updatePostById(@RequestBody PostDTO postDTO,@PathVariable(name="id") long id){
        PostDTO postResponse=postService.updatePost(postDTO, id);
        return new ResponseEntity<>(postResponse,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deletePostById(@PathVariable(name="id") long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("Post deleted successfully.",HttpStatus.OK);
    }

}



//
//
//        package com.chuwa.redbook.controller;
//
//        import com.chuwa.redbook.payload.PostDTO;
//        import com.chuwa.redbook.payload.PostResponse;
//        import com.chuwa.redbook.service.PostService;
//        import com.chuwa.redbook.util.AppConstants;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.http.HttpStatus;
//        import org.springframework.http.ResponseEntity;
//        import org.springframework.web.bind.annotation.*;
//
//        import java.util.List;
//
///**
// * @author b1go
// * @date 8/22/22 7:14 PM
// */
//@RestController
//@RequestMapping("/api/v1/posts")
//public class PostController {
//
//    @Autowired
//    private PostService postService;
//
//    @PostMapping()
//    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
//        PostDto postResponse = postService.createPost(postDto);
//        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
//    }
//
//    @GetMapping()
//    public PostResponse getAllPosts(
//            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
//            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
//            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
//            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIR, required = false) String sortDir
//    ) {
//        return postService.getAllPost(pageNo, pageSize, sortBy, sortDir);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
//        return ResponseEntity.ok(postService.getPostById(id));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PostDto> updatePostById(@RequestBody PostDto postDto, @PathVariable(name = "id") long id) {
//        PostDto postResponse = postService.updatePost(postDto, id);
//        return new ResponseEntity<>(postResponse, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
//        postService.deletePostById(id);
//        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
//    }
//
//}
//Footer
//        © 2023 GitHub, Inc.
//        Footer navigation
//        Terms
//        Privacy
//        Security
//        Status
//        Docs
//        Contact GitHub
//        Pricing
//        API
//        Training
//        Blog
//        About
//        springboot-redbook/PostController.java at 04_comment · TAIsRich/springboot-redbook