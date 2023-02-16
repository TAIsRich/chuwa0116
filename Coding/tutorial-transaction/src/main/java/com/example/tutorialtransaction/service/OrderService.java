package com.example.tutorialtransaction.service;

import com.example.tutorialtransaction.dto.OrderRequest;
import com.example.tutorialtransaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
