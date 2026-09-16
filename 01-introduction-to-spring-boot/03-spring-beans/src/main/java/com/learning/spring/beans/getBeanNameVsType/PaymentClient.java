package com.learning.spring.beans.getBeanNameVsType;

public class PaymentClient {
    private final String baseUrl;

    public PaymentClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void processPayment() {
        System.out.println("Calling : " + baseUrl);
    }
}
