package com.learning.spring.di.circularinjection;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    public void doSomething() {
        System.out.println("Service B");
    }
}
