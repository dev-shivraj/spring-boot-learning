package com.learning.spring.beans.configurationannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean
    public PaymentService paymentService() {
        return new PaymentService();
    }

    @Bean
    public PaymentClient paymentClient() {
        return new PaymentClient("https://payment.example.com");
    }
}
