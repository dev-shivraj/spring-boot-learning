package com.learning.spring.di.mapinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
@Order(1)
public class SmsNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("Sending sms: " + message);
    }
}
