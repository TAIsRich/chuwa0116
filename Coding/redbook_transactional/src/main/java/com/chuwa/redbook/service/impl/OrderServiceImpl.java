package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.Repository.OrderRepository;
import com.chuwa.redbook.Repository.PaymentRepository;
import com.chuwa.redbook.dto.OrderRequest;
import com.chuwa.redbook.dto.OrderResponse;
import com.chuwa.redbook.entity.Order;
import com.chuwa.redbook.entity.Payment;
import com.chuwa.redbook.exception.PaymentException;
import com.chuwa.redbook.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.UUID;
import javax.transaction.Transactional;


//import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.UUID;
import static java.util.UUID.randomUUID;
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
    public OrderResponse placeOrder(OrderRequest orderRequest){
        Order order=orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);
        Payment payment=orderRequest.getPayment();
        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }
        payment.setOrderId(order.getId());
        paymentRepository.save(payment);
        OrderResponse orderResponse=new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}
