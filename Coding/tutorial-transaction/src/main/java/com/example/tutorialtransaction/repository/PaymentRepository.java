package com.example.tutorialtransaction.repository;

import com.example.tutorialtransaction.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
