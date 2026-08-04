package com.shivraj.springboot.hello_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService paymentService() {
        // some more logic to create the bean of PaymentService class
        System.out.println("Creating bean of PaymentService class");
        return new PaymentService();
    }
}
