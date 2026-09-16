package com.learning.spring.beans.getBeanNameVsType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentClient paymentClient = context.getBean("ordersPaymentClient", PaymentClient.class);
        paymentClient.processPayment();

        PaymentClient refundClient = context.getBean("refundsPaymentClient", PaymentClient.class);
        refundClient.processPayment();
    }
}
