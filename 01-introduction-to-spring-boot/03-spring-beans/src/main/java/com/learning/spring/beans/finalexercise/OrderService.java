package com.learning.spring.beans.finalexercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentGateway paymentGateway;

    public OrderService(@Qualifier("stripePaymentGateway") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void placeOrder(double amount) {
        System.out.println("Creating order...");
        paymentGateway.pay(amount);
        System.out.println("Order placed successfully");
    }
}
