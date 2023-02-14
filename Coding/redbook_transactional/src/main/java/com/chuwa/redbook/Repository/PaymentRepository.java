package com.chuwa.redbook.Repository;

import com.chuwa.redbook.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
