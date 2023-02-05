package com.chuwa.mongoblog.service.impl;

import com.chuwa.mongoblog.model.GroceryItem;
import com.chuwa.mongoblog.payload.ItemDTO;
import com.chuwa.mongoblog.repository.ItemRepository;
import com.chuwa.mongoblog.service.ItemSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemSevice {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ItemDTO createPost(ItemDTO itemDto) {
        GroceryItem g = new GroceryItem();
        g.setId(itemDto.getId());
        g.setName(itemDto.getName());
        g.setCategory(itemDto.getCategory());
        g.setQuantity(itemDto.getQuantity());
        GroceryItem save = itemRepository.save(g);
        ItemDTO resp = new ItemDTO();
        resp.setId(save.getId());
        resp.setName(save.getName());
        resp.setCategory(save.getCategory());
        resp.setQuantity(save.getQuantity());
        return resp;
    }
}
