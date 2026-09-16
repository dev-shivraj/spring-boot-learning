package com.learning.spring.beans.primaryandqualifier;

import org.springframework.beans.factory.annotation.Qualifier;

public class RefundService {
    private final PaymentClient refundClient;

    public RefundService(@Qualifier("refundsPaymentClient") PaymentClient refundClient) {
        this.refundClient = refundClient;
    }

    public void processRefund() {
        System.out.println("Processing refund...");
        refundClient.processRefund();
    }
}
