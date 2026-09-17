package com.learning.spring.scopes.singleton.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyService.class);
        MyService service1 = context.getBean(MyService.class);
        MyService service2 = context.getBean(MyService.class);

        System.out.println("Service 1 : " + service1);
        System.out.println("Service 2 : " + service2);

        System.out.println("Are both equal ? " + (service1 == service2));


        // ==================================================================

        System.out.println("-----------------------");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(MyService.class);
        ApplicationContext context2 = new AnnotationConfigApplicationContext(MyService.class);
        service1 = context1.getBean(MyService.class);
        service2 = context2.getBean(MyService.class);

        System.out.println("Service 1 : " + service1);
        System.out.println("Service 2 : " + service2);

        System.out.println("Are both equal ? " + (service1 == service2));
    }
}
