package main.java.com.learning.spring.fundamentals.loosecoupling;

public class Main {
    public static void main(String[] args) {
        // NotificationService notificationService = new EmailNotificationService();

        // later business requirement got changed to use SMS Notification
        NotificationService notificationService = new SmsNotificationService();

        OrderService orderService = new OrderService(notificationService);

        orderService.placeOrder();
    }
}
