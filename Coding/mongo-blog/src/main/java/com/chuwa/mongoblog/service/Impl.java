package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.dao.ItemRepository;
import com.chuwa.mongoblog.entity.GroceryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Impl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public GroceryItem createItem(GroceryItem groceryItem) {
        GroceryItem g = new GroceryItem();
        g.setId(groceryItem.getId());
        g.setName(groceryItem.getName());
        g.setCategory(groceryItem.getCategory());
        g.setQuantity(groceryItem.getQuantity());
        GroceryItem save = itemRepository.save(g);
        return save;
    }
}
