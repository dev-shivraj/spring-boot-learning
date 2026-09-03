package com.learning.spring.di.setterinjection;

import org.springframework.stereotype.Component;

// @Component
public class AuditService {
    public void audit(String message) {
        System.out.println("Audit: " + message);
    }
}
