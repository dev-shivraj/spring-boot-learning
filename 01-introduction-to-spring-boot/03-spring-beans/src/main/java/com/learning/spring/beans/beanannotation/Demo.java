package com.learning.spring.beans.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail();
    }
}
