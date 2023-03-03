package com.chuwa.redbook.service;

import com.chuwa.redbook.dto.OrderRequest;
import com.chuwa.redbook.dto.OrderResponse;

public interface   OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
