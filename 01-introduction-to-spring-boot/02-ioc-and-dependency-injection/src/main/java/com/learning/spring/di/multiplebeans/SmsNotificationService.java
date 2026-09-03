package com.learning.spring.di.multiplebeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("Sending sms: " + message);
    }
}
