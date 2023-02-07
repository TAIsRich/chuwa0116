package com.chuwa.mongoblog.dao;

import com.chuwa.mongoblog.enetity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, Long> {

}
