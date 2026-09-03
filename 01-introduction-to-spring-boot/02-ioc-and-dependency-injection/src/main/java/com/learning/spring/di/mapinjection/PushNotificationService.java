package com.learning.spring.di.mapinjection;

import org.springframework.stereotype.Component;

@Component("push")
public class PushNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
