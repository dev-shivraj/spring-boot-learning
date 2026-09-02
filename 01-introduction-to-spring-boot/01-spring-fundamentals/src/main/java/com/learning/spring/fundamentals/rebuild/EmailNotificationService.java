package main.java.com.learning.spring.fundamentals.rebuild;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}
