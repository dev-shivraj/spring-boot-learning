package main.java.com.learning.spring.fundamentals.loosecoupling;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Email Notification Sent!");
    }
}
