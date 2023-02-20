package com.example.tutorialtransaction.repository;

import com.example.tutorialtransaction.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
