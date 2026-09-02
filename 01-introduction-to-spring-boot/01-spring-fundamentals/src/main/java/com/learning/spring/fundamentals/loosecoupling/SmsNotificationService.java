package main.java.com.learning.spring.fundamentals.loosecoupling;

public class SmsNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Sent!");
    }
}
