package com.learning.spring.di.mapinjection;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationDispatcher {
    Map<String, NotificationService> notificationServices;

    public NotificationDispatcher(Map<String, NotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void send(String type, String message) {
        NotificationService notificationService = notificationServices.get(type);
        notificationService.send(message);
    }
}
