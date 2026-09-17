package com.learning.spring.beans.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentClient paymentClient = context.getBean(PaymentClient.class);
        OrderService orderService = context.getBean(OrderService.class);
        PaymentClient orderPaymentClient = orderService.getPaymentClient();

        // it will currently give true
        // but if we remove @Configuration annotation from AppConfig, it will give false
        System.out.println("Same object ? " + (paymentClient == orderPaymentClient));
    }
}
