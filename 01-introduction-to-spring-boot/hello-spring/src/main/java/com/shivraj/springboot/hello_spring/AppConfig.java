package com.shivraj.springboot.hello_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    /*
           default scope is singleton, so we can omit this annotation
           @Scope("singleton")
     */

    /*
              if we want to create a new instance of PaymentService class every time we request it from Spring container
              then we can use prototype scope
     */
    @Scope("prototype")
    PaymentService paymentService() {
        // some more logic to create the bean of PaymentService class
        System.out.println("Creating bean of PaymentService class");
        return new PaymentService();
    }
}
