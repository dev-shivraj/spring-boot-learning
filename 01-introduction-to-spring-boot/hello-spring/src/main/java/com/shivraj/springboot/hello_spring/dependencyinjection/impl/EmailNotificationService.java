package com.shivraj.springboot.hello_spring.dependencyinjection.impl;

import com.shivraj.springboot.hello_spring.dependencyinjection.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}
