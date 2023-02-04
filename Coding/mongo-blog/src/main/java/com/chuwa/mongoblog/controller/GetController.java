package com.chuwa.mongoblog.controller;

import com.chuwa.mongoblog.model.GroceryItem;
import com.chuwa.mongoblog.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {

    @Autowired
    private GetService getService;

    @GetMapping("/{id}")
    public GroceryItem getItem(@PathVariable String id) {
        return getService.findById(id).orElse(null);
    }
}
