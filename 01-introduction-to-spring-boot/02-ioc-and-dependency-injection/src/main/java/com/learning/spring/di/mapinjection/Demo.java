package com.learning.spring.di.mapinjection;

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


        System.out.println("------------------------------------------");
        NotificationDispatcher dispatcher = context.getBean(NotificationDispatcher.class);
//        dispatcher.send("smsNotificationService", "Your order has been shipped");
//        dispatcher.send("emailNotificationService", "Your order has been delivered");

        dispatcher.send("sms", "Your order has been shipped");
        dispatcher.send("email", "Your order has been delivered");

    }
}
