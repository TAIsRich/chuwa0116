package com.example.tutorialtransaction.dto;

import com.example.tutorialtransaction.entity.Order;
import com.example.tutorialtransaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
