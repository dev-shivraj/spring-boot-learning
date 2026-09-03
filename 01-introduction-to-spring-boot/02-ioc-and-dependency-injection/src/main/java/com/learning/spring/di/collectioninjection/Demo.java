package com.learning.spring.di.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        System.out.println("------------------------------------------");
        OtpService otpService = context.getBean(OtpService.class);
        otpService.sendOtp();

    }
}
