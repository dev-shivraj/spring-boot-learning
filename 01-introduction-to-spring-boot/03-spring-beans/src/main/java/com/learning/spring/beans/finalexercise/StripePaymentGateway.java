package com.learning.spring.beans.finalexercise;

public class StripePaymentGateway implements PaymentGateway {
    private final PaymentClient paymentClient;

    public StripePaymentGateway(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @Override
    public void pay(double amount) {
        paymentClient.processPayment(amount);
        System.out.println("Payment processed through stripe");
    }
}
