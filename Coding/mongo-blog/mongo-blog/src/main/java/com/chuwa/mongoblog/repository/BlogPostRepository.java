package com.chuwa.mongoblog.repository;

import com.chuwa.mongoblog.DAO.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost,String> {
}
