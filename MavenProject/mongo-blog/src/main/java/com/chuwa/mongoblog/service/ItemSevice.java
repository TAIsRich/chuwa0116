package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.payload.ItemDTO;

public interface ItemSevice {
    ItemDTO createPost(ItemDTO itemDto);
}