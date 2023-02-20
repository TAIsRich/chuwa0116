package com.chuwa.tutorialtransaction.service;


import com.chuwa.tutorialtransaction.dto.OrderRequest;
import com.chuwa.tutorialtransaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
