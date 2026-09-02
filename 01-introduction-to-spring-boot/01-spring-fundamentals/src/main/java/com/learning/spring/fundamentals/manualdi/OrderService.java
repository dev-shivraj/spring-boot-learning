package main.java.com.learning.spring.fundamentals.manualdi;

import main.java.com.learning.spring.fundamentals.manualdi.notification.NotificationService;

public class OrderService {
    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Order Placed!");
        notificationService.sendNotification();
    }
}
