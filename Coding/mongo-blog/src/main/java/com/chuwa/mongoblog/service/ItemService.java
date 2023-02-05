package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.payload.ItemDTO;

public interface ItemService {
    ItemDTO createPost(ItemDTO itemDTO);
}
