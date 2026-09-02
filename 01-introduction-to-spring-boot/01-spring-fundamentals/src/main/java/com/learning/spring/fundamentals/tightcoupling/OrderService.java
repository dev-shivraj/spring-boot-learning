package main.java.com.learning.spring.fundamentals.tightcoupling;

public class OrderService {
    public void placeOrder() {
        System.out.println("Order placed.");

        //EmailNotificationService emailNotificationService = new EmailNotificationService();
        //emailNotificationService.sendNotification();

        // business no longer require email notification so changing to whatsapp notification
        WhatsAppNotificationService whatsAppNotificationService = new WhatsAppNotificationService();
        whatsAppNotificationService.sendNotification();
    }
}
