package com.example.mongoblog;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface BlogRepository  extends MongoRepository<Blog,String> {


    Blog findBlogByTitle(String name);


}
