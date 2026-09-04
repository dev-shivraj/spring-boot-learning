package com.learning.spring.beans.beansnaming;

import org.springframework.stereotype.Component;

@Component("smsNotifier")
public class SmsNotificationService {
    public void sendSms(String message) {
        System.out.println("Sending SMS : " + message);
    }
}
