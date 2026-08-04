package com.shivraj.springboot.hello_spring.dependencyinjection.impl;

import com.shivraj.springboot.hello_spring.dependencyinjection.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
