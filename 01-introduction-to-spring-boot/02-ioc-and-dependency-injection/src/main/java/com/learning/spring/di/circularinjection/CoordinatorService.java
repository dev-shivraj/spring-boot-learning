package com.learning.spring.di.circularinjection;

import org.springframework.stereotype.Service;

@Service
public class CoordinatorService {
    private final ServiceA serviceA;
    private final ServiceB serviceB;

    public CoordinatorService(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    public void coordinate() {
        serviceA.doSomething();
        serviceB.doSomething();
    }
}
