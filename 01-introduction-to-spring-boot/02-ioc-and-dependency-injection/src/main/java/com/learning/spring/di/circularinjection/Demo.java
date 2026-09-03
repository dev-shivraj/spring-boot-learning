package com.learning.spring.di.circularinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CoordinatorService service = context.getBean(CoordinatorService.class);
        service.coordinate();
    }
}
