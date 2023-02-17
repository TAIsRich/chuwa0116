package com.chuwa.redbook.dto;

import com.chuwa.redbook.entity.Order;
import com.chuwa.redbook.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderRequest {
    private Order order;
    private Payment payment;
}
