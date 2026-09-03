package com.learning.spring.di.mapinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final List<NotificationService> notificationServices;
    private final OrderRepository orderRepository;

    private AuditService auditService;

    public OrderService(List<NotificationService> notificationServices, OrderRepository orderRepository) {
        this.notificationServices = notificationServices;
        this.orderRepository = orderRepository;
    }

    @Autowired(required = false)
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        orderRepository.save();
        for(NotificationService notificationService : notificationServices) {
            notificationService.send("Order confirmation");
        }

        if(this.auditService != null) {
            auditService.audit("Order placed successfully");
        }
    }
}
