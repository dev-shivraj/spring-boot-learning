package com.learning.spring.beans.configurationannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail();

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.processPayment();

        PaymentClient paymentClient = context.getBean(PaymentClient.class);
        paymentClient.doSomething();
    }
}
