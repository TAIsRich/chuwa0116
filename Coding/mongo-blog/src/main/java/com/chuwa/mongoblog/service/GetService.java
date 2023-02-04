package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.model.GroceryItem;

import java.util.Optional;

public interface GetService {
    Optional<GroceryItem> findById(String id);
}
