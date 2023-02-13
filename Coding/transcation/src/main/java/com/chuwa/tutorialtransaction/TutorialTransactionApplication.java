package com.chuwa.tutorialtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TutorialTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialTransactionApplication.class, args);
	}

}
