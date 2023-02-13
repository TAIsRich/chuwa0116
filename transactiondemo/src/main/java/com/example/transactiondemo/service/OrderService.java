package com.example.transactiondemo.service;

import com.example.transactiondemo.dto.OrderRequest;
import com.example.transactiondemo.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
