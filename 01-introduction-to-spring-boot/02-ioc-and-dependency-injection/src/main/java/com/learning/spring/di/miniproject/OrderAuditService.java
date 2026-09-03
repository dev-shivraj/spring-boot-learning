package com.learning.spring.di.miniproject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderAuditService implements AuditService{
    @Override
    public void audit(String message) {
        System.out.println("Audit: " + message);
    }
}
