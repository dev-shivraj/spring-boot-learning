package com.learning.spring.beans.intro;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void sendEmail() {
        System.out.println("Sending email...");
    }
}