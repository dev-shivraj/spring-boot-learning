package com.shivraj.springboot.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

        // not a good practice to create an object of PaymentService class like this
        // because it will not be managed by Spring container
        // and we will not be able to use the features of Spring framework like dependency injection, AOP, etc.
        PaymentService paymentService = new PaymentService();
        paymentService.pay();
	}

}
