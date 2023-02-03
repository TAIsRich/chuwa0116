package com.chuwa.mongoblog.dao;

import com.chuwa.mongoblog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/3/23
 */
@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
