package com.shivraj.springboot.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {

    @Autowired
    PaymentService paymentService;

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

        /*
            // not a good practice to create an object of PaymentService class like this
            // because it will not be managed by Spring container
            // and we will not be able to use the features of Spring framework like dependency injection, AOP, etc.
            // PaymentService paymentService = null;
            PaymentService paymentService = new PaymentService();
            paymentService.pay();
         */
	}

    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
    }
}
