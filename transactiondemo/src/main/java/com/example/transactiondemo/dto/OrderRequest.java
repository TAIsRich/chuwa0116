package com.example.transactiondemo.dto;

import com.example.transactiondemo.entity.Order;
import com.example.transactiondemo.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
