package com.learning.spring.beans.finalexercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.learning.spring.beans.finalexercise")
public class AppConfig {
    @Bean
    @Primary
    public PaymentGateway stripePaymentGateway(PaymentClient stripePaymentClient) {
        return new StripePaymentGateway(stripePaymentClient);
    }

    @Bean
    public PaymentGateway razorpayPaymentGateway(PaymentClient razorpayPaymentClient) {
        return new RazorpayClientGateway(razorpayPaymentClient);
    }

    @Bean(name = "stripePaymentClient")
    public PaymentClient stripePaymentClient() {
        return new PaymentClient("https://api.stripe.com");
    }

    @Bean(name = "razorpayPaymentClient")
    public PaymentClient razorpayPaymentClient() {
        return new PaymentClient("https://api.razorpay.com");
    }
}
