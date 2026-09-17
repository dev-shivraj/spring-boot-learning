package com.learning.spring.scopes.singleton.example1;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void execute() {
        System.out.println("MyServie is executing...");
    }
}
