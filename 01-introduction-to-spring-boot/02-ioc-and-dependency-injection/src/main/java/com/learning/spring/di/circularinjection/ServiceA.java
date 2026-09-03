package com.learning.spring.di.circularinjection;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void doSomething() {
        System.out.println("Service A");
    }
}
