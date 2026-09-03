package com.learning.spring.di.collectioninjection;

import org.springframework.stereotype.Component;

@Component
public class PushNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
