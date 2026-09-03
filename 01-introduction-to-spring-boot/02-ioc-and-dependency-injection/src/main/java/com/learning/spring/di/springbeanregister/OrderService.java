package com.learning.spring.di.springbeanregister;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
        System.out.println("OrderService object created");
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notificationService.send("Order confirmation");
    }
}
