package com.learning.spring.beans.primaryandqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class OrderService {

    private PaymentClient paymentClient;

    public OrderService(@Qualifier("ordersPaymentClient") PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    public void placeOrder() {
        System.out.println("Placing order...");
        paymentClient.processPayment();
    }
}
