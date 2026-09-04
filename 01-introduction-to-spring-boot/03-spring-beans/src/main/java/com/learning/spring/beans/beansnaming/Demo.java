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

        System.out.println("-------------------------------------");
        PaymentClient ordersPaymentClient = (PaymentClient) context.getBean("ordersPaymentClient");
        ordersPaymentClient.doSomething();

        System.out.println("-------------------------------------");
        PaymentClient refundsPaymentClient = (PaymentClient) context.getBean("refundsPaymentClient");
        refundsPaymentClient.doSomething();
    }
}
