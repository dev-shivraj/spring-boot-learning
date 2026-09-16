package com.learning.spring.beans.primaryandqualifier;

public class PaymentClient {
    private final String baseUrl;

    public PaymentClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void processPayment() {
        System.out.println("Processing Payment using : " + baseUrl);
    }

    public void processRefund() {
        System.out.println("Processing Refund using : " + baseUrl);
    }
}
