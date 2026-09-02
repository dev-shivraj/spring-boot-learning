package com.learning.spring.di.springbeanregister;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService {
    public SmsNotificationService() {
        System.out.println("SmsNotificationService object created");
    }

    public void send(String message) {
        System.out.println("Sending sms: " + message);
    }
}
