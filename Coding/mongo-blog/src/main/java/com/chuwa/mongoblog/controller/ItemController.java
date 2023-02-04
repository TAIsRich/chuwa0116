package com.chuwa.mongoblog.controller;

import com.chuwa.mongoblog.entity.GroceryItem;
import com.chuwa.mongoblog.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<GroceryItem> savePost(@RequestBody GroceryItem groceryItem){
        GroceryItem response = itemService.createItem(groceryItem);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
