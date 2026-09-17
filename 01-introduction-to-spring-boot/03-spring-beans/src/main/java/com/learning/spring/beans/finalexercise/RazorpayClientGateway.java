package com.learning.spring.beans.finalexercise;

public class RazorpayClientGateway implements PaymentGateway{
    private final PaymentClient paymentClient;

    public RazorpayClientGateway(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @Override
    public void pay(double amount) {
        paymentClient.processPayment(amount);
        System.out.println("Payment processed through Razorpay");
    }
}
