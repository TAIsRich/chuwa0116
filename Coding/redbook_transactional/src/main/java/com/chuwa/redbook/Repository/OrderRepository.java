package com.chuwa.redbook.Repository;

import com.chuwa.redbook.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
