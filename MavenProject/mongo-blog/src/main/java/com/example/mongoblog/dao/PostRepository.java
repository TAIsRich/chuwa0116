package com.example.mongoblog.dao;

import com.example.mongoblog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, Long> {
    // no need to write anything here (yet)
}
