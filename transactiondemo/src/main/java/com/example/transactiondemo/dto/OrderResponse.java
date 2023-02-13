package com.example.transactiondemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String orderTracingNumber;
    private String status;
    private String message;

}
