package com.chuwa.mongoblog.service.impl;

import com.chuwa.mongoblog.dao.PostRepository;
import com.chuwa.mongoblog.entity.Post;
import com.chuwa.mongoblog.payload.PostDTO;
import com.chuwa.mongoblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        // 把payload转换成entity，这样才能dao去把该数据存到数据库中。
        Post post = new Post();
        if (postDTO.getTitle() != null) {
            post.setTitle(postDTO.getTitle());
        } else {
            post.setTitle("");
        }
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        // 此时已成功把request body的信息传递给entity

        // 调用Dao的save 方法，将entity的数据存储到数据库MySQL
        // save()会返回存储在数据库中的数据
        Post savedPost = postRepository.save(post);

        // 将save() 返回的数据转换成controller/前端 需要的数据，然后return给controller
        PostDTO postResponse = new PostDTO();
        postResponse.setId(savedPost.getId());
        postResponse.setTitle(savedPost.getTitle());
        postResponse.setDescription(savedPost.getDescription());
        postResponse.setContent(savedPost.getContent());
        return postResponse;
    }

}
