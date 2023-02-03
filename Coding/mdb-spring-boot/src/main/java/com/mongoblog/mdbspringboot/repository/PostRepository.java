package com.mongoblog.mdbspringboot.repository;

import com.mongoblog.mdbspringboot.dao.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}

