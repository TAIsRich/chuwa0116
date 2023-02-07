package com.chuwa.mongoblog.service.impl;

import com.chuwa.mongoblog.exception.ResourceNotFoundException;
import com.chuwa.mongoblog.model.GroceryItem;
import com.chuwa.mongoblog.repository.ItemRepository;
import com.chuwa.mongoblog.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceimpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public GroceryItem findById(String id) {
        return itemRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("GroceryItem", "id", id));
    }

    @Override
    public GroceryItem createItem(GroceryItem groceryItem) {
        GroceryItem newItem = itemRepository.save(groceryItem);
        return newItem;
    }

    @Override
    public List<GroceryItem> createItems(List<GroceryItem> groceryItemList) {
        List<GroceryItem> list = itemRepository.saveAll(groceryItemList);
        return list;
    }

    @Override
    public GroceryItem updateItem(String id, GroceryItem groceryItem) {
        GroceryItem item = itemRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("GroceryItem", "id", id));
        itemRepository.save(groceryItem);
        return groceryItem;
    }

    @Override
    public GroceryItem deleteItem(String id) {
        GroceryItem item = itemRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("GroceryItem", "id", id));
        itemRepository.delete(item);
        return item;
    }
}
