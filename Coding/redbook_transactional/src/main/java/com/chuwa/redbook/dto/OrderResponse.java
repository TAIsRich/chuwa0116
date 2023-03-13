package com.chuwa.redbook.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderResponse {
    private String orderTackingNumber;
    private  String message;
    private String status;
}
