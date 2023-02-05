package com.chuwa.mongoblog.dao;

import com.chuwa.mongoblog.entity.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String> {
}
