package Coding.hw42transactional.service;


import com.chuwa.tutorialtransaction.dto.OrderRequest;
import com.chuwa.tutorialtransaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
