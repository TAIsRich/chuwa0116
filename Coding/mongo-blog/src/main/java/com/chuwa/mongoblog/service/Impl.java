package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.dao.ItemRepository;
import com.chuwa.mongoblog.entity.GroceryItem;
import com.chuwa.mongoblog.payload.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Impl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public ItemDto createItem(ItemDto itemDto) {
        GroceryItem g = new GroceryItem();
        g.setId(itemDto.getId());
        g.setName(itemDto.getName());
        g.setCategory(itemDto.getCategory());
        g.setQuantity(itemDto.getQuantity());
        GroceryItem save = itemRepository.save(g);
        ItemDto resp = new ItemDto();
        resp.setId(save.getId());
        resp.setName(save.getName());
        resp.setCategory(save.getCategory());
        resp.setQuantity(save.getQuantity());

        return resp;
    }
}
