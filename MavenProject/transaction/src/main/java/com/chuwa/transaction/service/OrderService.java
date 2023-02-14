package com.chuwa.transaction.service;

import com.chuwa.transaction.dto.OrderRequest;
import com.chuwa.transaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}