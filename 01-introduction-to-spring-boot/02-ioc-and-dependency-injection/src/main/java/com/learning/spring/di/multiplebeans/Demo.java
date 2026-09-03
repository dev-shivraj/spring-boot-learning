package com.learning.spring.di.multiplebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();


        /*
            System.out.println("------------------------------------------");
            // after making EmailNotificationService as primary bean, it doesn't mean that we disable other implementation like SmsNotificationService in our case
            // it still exists
            SmsNotificationService smsService = context.getBean(SmsNotificationService.class);
            smsService.send("Hello!");
         */


        System.out.println("------------------------------------------");
        OtpService otpService = context.getBean(OtpService.class);
        otpService.sendOtp();

    }
}
