package Coding.hw42transactional.repository;

import com.chuwa.tutorialtransaction.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
