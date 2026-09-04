package com.learning.spring.beans.beansnaming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // EmailService emailService = context.getBean(EmailService.class);
        EmailService emailService = (EmailService) context.getBean("emailService");
        // EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.sendEmail();
    }
}
