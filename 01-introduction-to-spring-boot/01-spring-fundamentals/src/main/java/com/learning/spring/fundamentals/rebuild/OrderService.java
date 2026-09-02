package main.java.com.learning.spring.fundamentals.rebuild;



public class OrderService {
    PaymentService paymentService;
    NotificationService notificationService;

    public OrderService(PaymentService paymentService, NotificationService emailNotificationService) {
        this.paymentService = paymentService;
        this.notificationService = emailNotificationService;
    }

    public void placeOrder() {
        System.out.println("Processing the Order");
        paymentService.processPayment();
        notificationService.sendNotification();
    }
}
