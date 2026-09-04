package com.learning.spring.beans.beansnaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmailService emailService() {
        return new EmailService();
    }
}
