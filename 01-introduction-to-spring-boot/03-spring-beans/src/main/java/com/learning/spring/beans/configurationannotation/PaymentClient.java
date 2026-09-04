package com.learning.spring.beans.configurationannotation;

public class PaymentClient {
    private final String baseUrl;

    public PaymentClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void doSomething() {
        System.out.println("Payment client doing something with base url : " + baseUrl);
    }
}