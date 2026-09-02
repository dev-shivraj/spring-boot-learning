package com.learning.spring.di.springbeanregister;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerDemo {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailNotificationService service = context.getBean(EmailNotificationService.class);
        service.send("Hello Spring");
    }
}
