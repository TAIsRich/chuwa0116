package Coding.hw42transactional.dto;

import com.chuwa.tutorialtransaction.entity.Order;
import com.chuwa.tutorialtransaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
