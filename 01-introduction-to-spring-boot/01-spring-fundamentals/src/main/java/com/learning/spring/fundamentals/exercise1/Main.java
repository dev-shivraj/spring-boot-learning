package main.java.com.learning.spring.fundamentals.exercise1;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        OrderService orderService = new OrderService(notificationService);

        orderService.placeOrder();
    }
}