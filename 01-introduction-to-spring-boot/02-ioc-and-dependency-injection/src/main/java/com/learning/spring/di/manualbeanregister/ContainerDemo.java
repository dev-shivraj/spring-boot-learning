package com.learning.spring.di.manualbeanregister;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerDemo {
    public static void main(String[] args) {
        // create an empty application context
        // ApplicationContext context = new AnnotationConfigApplicationContext();
        //System.out.println("Application context created");


        // create our object
        EmailNotificationService service = new EmailNotificationService();

        // create application context and register our object in the context as bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getBeanFactory().registerSingleton("emailNotificationService", service);
        context.refresh();

        // now get our object from the context as it was registered earlier
        EmailNotificationService bean = context.getBean(EmailNotificationService.class);
        bean.send("Hello Spring");

    }
}
