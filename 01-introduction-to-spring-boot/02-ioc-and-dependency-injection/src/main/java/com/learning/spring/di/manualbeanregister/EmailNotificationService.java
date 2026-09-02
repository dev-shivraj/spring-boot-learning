package com.learning.spring.di.manualbeanregister;

public class EmailNotificationService {
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
