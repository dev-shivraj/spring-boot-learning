package main.java.com.learning.spring.fundamentals.exercise1;

public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notificationService.sendNotification();
    }
}