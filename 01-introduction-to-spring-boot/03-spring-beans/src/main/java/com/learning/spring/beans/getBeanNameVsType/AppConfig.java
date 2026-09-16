package com.learning.spring.beans.getBeanNameVsType;

import org.springframework.context.annotation.Bean;

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
