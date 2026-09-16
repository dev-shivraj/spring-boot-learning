package com.learning.spring.beans.multiplebeansofsametype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning.spring.beans.multiplebeansofsametype")
public class AppConfig {
    @Bean
    public PaymentClient ordersPaymentClient() {
        return new PaymentClient("https://payment-api.com");
    }

    @Bean
    public PaymentClient refundsPaymentClient() {
        return new PaymentClient("https://refund-api.com");
    }
}
