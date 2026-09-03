package com.learning.spring.di.collectioninjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OtpService {
    NotificationService notificationService;

//    public OtpService(@Qualifier("smsNotificationService") NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    public OtpService(@Qualifier("sms") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendOtp() {
        notificationService.send("Your OTP is 123456");
    }
}
