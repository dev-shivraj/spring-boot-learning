package com.learning.spring.di.fieldinjection;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("Sending sms: " + message);
    }
}
