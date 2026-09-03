package com.learning.spring.di.circularinjection;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void doSomething() {
        System.out.println("Service B");
    }
}
