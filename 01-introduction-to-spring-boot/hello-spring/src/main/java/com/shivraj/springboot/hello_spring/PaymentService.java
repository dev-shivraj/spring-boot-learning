package com.shivraj.springboot.hello_spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void initXYZ() {
        System.out.println("PaymentService bean is just initialized");
    }

    @PreDestroy
    public void destroyXYZ() {
        System.out.println("PaymentService bean is about to be destroyed");
    }
}
