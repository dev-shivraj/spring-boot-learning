package com.learning.spring.di.springbeanregister;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class OrderService {
    private final NotificationService notificationService;
    private final OrderRepository orderRepository;

    public OrderService(NotificationService notificationService, OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.orderRepository = orderRepository;
        System.out.println("OrderService object created");
    }

    public void placeOrder() {
        System.out.println("Order placed");
        orderRepository.save();
        notificationService.send("Order confirmation");
    }
}
