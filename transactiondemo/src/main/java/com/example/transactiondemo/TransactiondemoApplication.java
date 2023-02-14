package com.example.transactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactiondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactiondemoApplication.class, args);
	}

}
