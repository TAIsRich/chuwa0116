package com.chuwa.tutorialtransaction.service.impl;


import com.chuwa.tutorialtransaction.dto.OrderRequest;
import com.chuwa.tutorialtransaction.dto.OrderResponse;
import com.chuwa.tutorialtransaction.entity.Order;
import com.chuwa.tutorialtransaction.entity.Payment;
import com.chuwa.tutorialtransaction.exception.PaymentException;
import com.chuwa.tutorialtransaction.repository.OrderRepository;
import com.chuwa.tutorialtransaction.repository.PaymentRepository;
import com.chuwa.tutorialtransaction.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}
