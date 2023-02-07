package com.chuwa.mongoblog.dao;

import com.chuwa.mongoblog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, Long> {

//    @Query("{name:'?0'}")
//    GroceryItem findItemByName(String name);
//
//    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
//    List<GroceryItem> findAll(String category);
//
//    public long count();
}
