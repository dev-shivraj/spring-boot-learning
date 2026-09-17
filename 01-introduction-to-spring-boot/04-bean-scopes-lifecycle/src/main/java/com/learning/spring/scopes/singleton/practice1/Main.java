package com.learning.spring.scopes.singleton.practice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CounterService.class);

        CounterService counter1 = context.getBean(CounterService.class);
        CounterService counter2 = context.getBean(CounterService.class);

        System.out.println("Count: " + counter1.getCount());
        counter2.increment();
        System.out.println("Count: " + counter1.getCount());

        System.out.println("counter1 and counter2 are same ? " + (counter1 == counter2));
    }
}
