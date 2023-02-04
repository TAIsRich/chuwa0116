package com.chuwa.mongoblog.service.Impl;

import com.chuwa.mongoblog.dao.ItemRepository;
import com.chuwa.mongoblog.entity.GroceryItem;
import com.chuwa.mongoblog.payload.ItemDTO;
import com.chuwa.mongoblog.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public ItemDTO createPost(ItemDTO itemDTO) {
        GroceryItem groceryItem = new GroceryItem();
        groceryItem.setId(itemDTO.getId());
        groceryItem.setName(itemDTO.getName());
        groceryItem.setCategory(itemDTO.getCategory());
        groceryItem.setCategory(itemDTO.getCategory());

        GroceryItem savedItem = itemRepository.save(groceryItem);

        ItemDTO response = new ItemDTO();
        response.setId(savedItem.getId());
        response.setName(savedItem.getName());
        response.setCategory(savedItem.getCategory());
        response.setQuantity(savedItem.getQuantity());

        return response;
    }
}
