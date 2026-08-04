package com.shivraj.springboot.hello_spring.dependencyinjection.impl;

import com.shivraj.springboot.hello_spring.dependencyinjection.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotificationService")
@ConditionalOnProperty(name = "notification.type", havingValue = "sms", matchIfMissing = true)
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
