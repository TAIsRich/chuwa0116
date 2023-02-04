package com.chuwa.mongoblog.service.impl;

import com.chuwa.mongoblog.model.GroceryItem;
import com.chuwa.mongoblog.repository.ItemRepository;
import com.chuwa.mongoblog.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetServiceimpl implements GetService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Optional<GroceryItem> findById(String id) {
        return itemRepository.findById(id);
    }
}
