package com.learning.spring.beans.beansnaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning.spring.beans.beansnaming")
public class AppConfig {
    @Bean
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean(name = "ordersPaymentClient")
    public PaymentClient paymentClient() {
        return new PaymentClient("https://payment-api.com");
    }

    @Bean(name = "refundsPaymentClient")
    public PaymentClient refundClient() {
        return new PaymentClient("https://refund-api.com");
    }
}
