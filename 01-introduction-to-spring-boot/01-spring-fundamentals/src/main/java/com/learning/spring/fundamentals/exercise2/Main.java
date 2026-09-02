package main.java.com.learning.spring.fundamentals.exercise2;

public class Main {
    public static void main(String[] args) {
        PaymentRepository paymentRepository = new MySqlPaymentRepository();
        PaymentService paymentService = new CardPaymentService(paymentRepository);

        NotificationService notificationService = new EmailNotificationService();
        OrderService orderService = new OrderService(paymentService, notificationService);
        OrderController orderController = new OrderController(orderService);

        orderController.createOrder();
    }
}