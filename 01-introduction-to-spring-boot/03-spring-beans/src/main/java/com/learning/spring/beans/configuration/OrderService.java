package com.learning.spring.beans.configuration;

public class OrderService {
    private final PaymentClient paymentClient;

    public OrderService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    public PaymentClient getPaymentClient() {
        return paymentClient;
    }
}
