package com.learning.spring.beans.componentscanandexplicitbean.explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning.spring.beans.componentscanandexplicitbean.explicit")
public class AppConfig {
    @Bean
    public EmailService emailService() {
        return new EmailService();
    }
}
