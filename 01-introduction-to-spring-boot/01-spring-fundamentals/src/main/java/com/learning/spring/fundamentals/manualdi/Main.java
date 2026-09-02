package main.java.com.learning.spring.fundamentals.manualdi;

import main.java.com.learning.spring.fundamentals.manualdi.notification.EmailNotificationService;
import main.java.com.learning.spring.fundamentals.manualdi.notification.NotificationService;
import main.java.com.learning.spring.fundamentals.manualdi.notification.SmsNotificationService;

public class Main {
    public static void main(String[] args) {
        // NotificationService notificationService = new EmailNotificationService();

        NotificationService notificationService = new SmsNotificationService();
        OrderService orderService = new OrderService(notificationService);

        orderService.placeOrder();
    }
}
