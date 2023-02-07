package com.chuwa.mongoblog.controller;

import com.chuwa.mongoblog.model.GroceryItem;
import com.chuwa.mongoblog.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/{id}")
    public ResponseEntity<GroceryItem> getItemById(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(itemService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<GroceryItem> createItem(@RequestBody GroceryItem groceryItem) {
        return ResponseEntity.ok(itemService.createItem(groceryItem));
    }

    @PostMapping("/all")
    public List<GroceryItem> createItems(@RequestBody List<GroceryItem> groceryItemList) {
        return itemService.createItems(groceryItemList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateItem(@PathVariable(name = "id") String id, @RequestBody GroceryItem groceryItem) {
        return ResponseEntity.ok(itemService.updateItem(id, groceryItem));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GroceryItem> deleteItem(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(itemService.deleteItem(id));
    }
}
