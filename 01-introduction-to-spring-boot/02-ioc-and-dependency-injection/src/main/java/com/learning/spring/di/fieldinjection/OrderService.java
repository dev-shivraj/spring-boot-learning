package com.learning.spring.di.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private NotificationService notificationService;

    @Autowired
    private OrderRepository orderRepository;


    public void placeOrder() {
        System.out.println("Order placed");
        orderRepository.save();
        notificationService.send("Order confirmation");
    }
}
