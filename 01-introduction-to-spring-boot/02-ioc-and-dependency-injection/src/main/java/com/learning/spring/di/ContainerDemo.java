package com.learning.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        System.out.println("Application context created");
    }
}
