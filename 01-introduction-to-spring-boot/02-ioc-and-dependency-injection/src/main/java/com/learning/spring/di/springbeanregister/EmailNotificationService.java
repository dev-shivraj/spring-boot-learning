package com.learning.spring.di.springbeanregister;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService{
    public EmailNotificationService() {
        System.out.println("EmailNotificationService object created");
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
