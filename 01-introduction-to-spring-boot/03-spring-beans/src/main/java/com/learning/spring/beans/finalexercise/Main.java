package com.learning.spring.beans.finalexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(1000);
        System.out.println();

        PaymentGateway defaultGatewasy = context.getBean(PaymentGateway.class);
        System.out.println("Default PaymentGateway: " + defaultGatewasy.getClass().getSimpleName());
        System.out.println();

        PaymentGateway razorpayGateway = context.getBean("razorpayPaymentGateway", PaymentGateway.class);
        System.out.println("Named PaymentGateway: " + razorpayGateway.getClass().getSimpleName());
    }
}
