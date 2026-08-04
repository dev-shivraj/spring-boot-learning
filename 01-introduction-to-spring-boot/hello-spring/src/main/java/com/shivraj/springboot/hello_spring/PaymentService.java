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
    /*
    when the scope of the bean is singleton, Spring container will manage the lifecycle of the bean, so it will call the destroy method of the bean
    when the scope of the bean is prototype, Spring container will not manage the lifecycle of the bean, so it will not call the destroy method of the bean
     */
    public void destroyXYZ() {
        System.out.println("PaymentService bean is about to be destroyed");
    }
}
