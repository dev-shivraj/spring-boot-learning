package main.java.com.learning.spring.fundamentals.exercise1;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}