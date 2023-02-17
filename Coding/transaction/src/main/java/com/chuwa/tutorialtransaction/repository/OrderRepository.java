package com.chuwa.tutorialtransaction.repository;

import com.chuwa.tutorialtransaction.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
