package com.chuwa.tutorialtransaction.repository;

import com.chuwa.tutorialtransaction.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
