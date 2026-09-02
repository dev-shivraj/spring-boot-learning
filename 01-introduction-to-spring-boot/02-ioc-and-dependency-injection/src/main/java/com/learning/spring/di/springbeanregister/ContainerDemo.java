package com.learning.spring.di.springbeanregister;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerDemo {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailNotificationService service = context.getBean(EmailNotificationService.class);
        service.send("Hello Spring");

        EmailNotificationService service1 = context.getBean(EmailNotificationService.class);
        System.out.println(service == service1); // true : cz both variables reference the same Spring-managed bean instance under the default singleton scope


        System.out.println("-----------------------------------");
        SmsNotificationService smsNotificationService = context.getBean(SmsNotificationService.class);
        smsNotificationService.send("Hello Again!");
    }
}
