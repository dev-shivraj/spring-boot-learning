package com.learning.spring.beans.primaryandqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class AppConfig {
    @Bean
    @Primary
    public PaymentClient ordersPaymentClient() {
        return new PaymentClient("https://payment-api.com");
    }

    @Bean
    public PaymentClient refundsPaymentClient() {
        return new PaymentClient("https://refund-api.com");
    }

    @Bean
    public OrderService orderService(@Qualifier("ordersPaymentClient") PaymentClient paymentClient) {
        return new OrderService(paymentClient);
    }

    @Bean
    public RefundService refundService(@Qualifier("refundsPaymentClient") PaymentClient paymentClient) {
        return new RefundService(paymentClient);
    }
}
