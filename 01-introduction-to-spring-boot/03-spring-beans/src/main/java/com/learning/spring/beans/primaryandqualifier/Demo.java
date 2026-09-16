package com.learning.spring.beans.primaryandqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
        System.out.println();

        RefundService refundService = context.getBean(RefundService.class);
        refundService.processRefund();


        System.out.println("-------------------------------------------");

        PaymentClient patmentClient = context.getBean(PaymentClient.class);
        patmentClient.processPayment();
        System.out.println();

        PaymentClient refundClient = context.getBean("refundsPaymentClient", PaymentClient.class);
        refundClient.processPayment();
        System.out.println();
    }
}
