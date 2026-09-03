package com.learning.spring.di.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final NotificationService notificationService;
    private final OrderRepository orderRepository;

    private AuditService auditService;

    public OrderService(NotificationService notificationService, OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.orderRepository = orderRepository;
    }

    @Autowired
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        orderRepository.save();
        notificationService.send("Order confirmation");
        auditService.audit("Order placed successfully");
    }
}
