package com.mongoblog.mdbspringboot.dao;

import com.mongoblog.mdbspringboot.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}

