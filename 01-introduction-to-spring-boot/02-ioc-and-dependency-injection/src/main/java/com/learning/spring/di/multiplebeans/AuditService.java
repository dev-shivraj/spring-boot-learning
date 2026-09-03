package com.learning.spring.di.multiplebeans;

// @Component
public class AuditService {
    public void audit(String message) {
        System.out.println("Audit: " + message);
    }
}
