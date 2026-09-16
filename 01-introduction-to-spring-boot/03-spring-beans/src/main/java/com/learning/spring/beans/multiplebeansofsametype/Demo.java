package com.learning.spring.beans.multiplebeansofsametype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentClient orderClient = context.getBean("ordersPaymentClient", PaymentClient.class);
        System.out.println("Orders Client:");
        orderClient.processPayment();
        System.out.println();

        PaymentClient refundClient = context.getBean("refundsPaymentClient", PaymentClient.class);
        System.out.println("Refunds Client:");
        refundClient.processPayment();
        System.out.println();

        System.out.println("Are they same object ? " + (orderClient == refundClient));
    }
}
