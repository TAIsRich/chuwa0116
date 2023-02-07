package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.model.GroceryItem;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    GroceryItem findById(String id);
    GroceryItem createItem(GroceryItem groceryItem);
    List<GroceryItem> createItems(List<GroceryItem> groceryItemList);
    GroceryItem updateItem(String id, GroceryItem groceryItem);
    GroceryItem deleteItem(String id);
}
