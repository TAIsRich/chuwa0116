package com.chuwa.cassandra.dao;

import com.chuwa.cassandra.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,String> {
}
