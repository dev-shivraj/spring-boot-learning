package main.java.com.learning.spring.fundamentals.exercise2;

public class OrderService {
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public OrderService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Placing order");

        paymentService.processPayment();
        notificationService.sendNotification();
    }
}