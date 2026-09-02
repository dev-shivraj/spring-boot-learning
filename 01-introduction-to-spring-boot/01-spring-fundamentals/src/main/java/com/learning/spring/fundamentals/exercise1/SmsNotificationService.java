package main.java.com.learning.spring.fundamentals.exercise1;

public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent");
    }
}