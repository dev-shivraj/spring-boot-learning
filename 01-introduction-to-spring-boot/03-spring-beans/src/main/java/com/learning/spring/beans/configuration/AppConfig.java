package com.learning.spring.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentClient paymentClient() {
        return new PaymentClient("https://payment-api.com");
    }

    @Bean
    public OrderService orderService() {
        return new OrderService(paymentClient());
    }

//    // this is better than above
//    @Bean
//    public OrderService orderService(PaymentClient paymentClient) {
//        return new OrderService(paymentClient);
//    }
}
