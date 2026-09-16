package com.learning.spring.beans.multiplebeansofsametype;

public class PaymentClient {
    private final String baseUrl;

    public PaymentClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void processPayment() {
        System.out.println("Processing Payment using: " + baseUrl);
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
