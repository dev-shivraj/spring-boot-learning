package main.java.com.learning.spring.fundamentals.manualdi.notification;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification Sent!");
    }
}
