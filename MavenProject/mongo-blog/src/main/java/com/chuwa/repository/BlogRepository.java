package com.chuwa.repository;

import com.chuwa.entity.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<Blog,String> {
}
