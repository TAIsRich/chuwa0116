package com.chuwa.mongoblog.service.Impl;


import com.chuwa.mongoblog.payload.PostDTO;
import com.chuwa.mongoblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public PostDTO createPost(PostDTO postDTO) {
        return mongoTemplate.insert(postDTO);


    }

}
