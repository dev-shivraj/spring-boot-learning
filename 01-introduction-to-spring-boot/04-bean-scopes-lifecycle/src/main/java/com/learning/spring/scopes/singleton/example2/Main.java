package com.learning.spring.scopes.singleton.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LazyService.class);

        System.out.println("Context created...");
        System.out.println("Requesting LazyService...");

        LazyService lazyService = context.getBean(LazyService.class);
        System.out.println("Bean Obtained.");
        lazyService.execute();
    }
}
