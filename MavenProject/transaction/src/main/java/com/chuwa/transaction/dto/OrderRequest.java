package com.chuwa.transaction.dto;

import com.chuwa.transaction.entity.Order;
import com.chuwa.transaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
