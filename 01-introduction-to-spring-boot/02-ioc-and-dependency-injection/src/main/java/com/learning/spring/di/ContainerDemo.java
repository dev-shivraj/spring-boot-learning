package com.learning.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerDemo {
    public static void main(String[] args) {
        // ApplicationContext context = new AnnotationConfigApplicationContext();
        //System.out.println("Application context created");


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        EmailNotificationService service = new EmailNotificationService();

        context.getBeanFactory().registerSingleton("emailNotificationService", service);
        context.refresh();

        EmailNotificationService bean = context.getBean(EmailNotificationService.class);
        bean.send("Hello Spring");

    }
}
