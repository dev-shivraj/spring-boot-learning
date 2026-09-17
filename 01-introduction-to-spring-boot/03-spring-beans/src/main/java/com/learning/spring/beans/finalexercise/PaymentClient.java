package com.learning.spring.beans.finalexercise;

public class PaymentClient {
    private final String baseUrl;

    public PaymentClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void processPayment(double amount) {
        System.out.println("Calling payment API: " + baseUrl + " | Amount: " + amount);
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
