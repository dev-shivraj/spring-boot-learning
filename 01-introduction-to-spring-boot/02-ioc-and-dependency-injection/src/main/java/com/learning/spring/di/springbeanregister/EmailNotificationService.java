package com.learning.spring.di.springbeanregister;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService {
    public EmailNotificationService() {
        System.out.println("EmailNotificationService object created");
    }

    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
