package com.shivraj.springboot.hello_spring.dependencyinjection.impl;

import com.shivraj.springboot.hello_spring.dependencyinjection.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("emailNotificationService")
//@ConditionalOnProperty(name = "notification.type", havingValue = "email", matchIfMissing = true)
@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}
