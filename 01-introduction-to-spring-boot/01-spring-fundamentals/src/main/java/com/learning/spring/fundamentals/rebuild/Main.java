package main.java.com.learning.spring.fundamentals.rebuild;

public class Main {
    public static void main(String[] args) {
        PaymentRepository paymentRepository = new MySQLPaymentRepository();
        PaymentService paymentService = new UPIPaymentService(paymentRepository);
        NotificationService notificationService = new EmailNotificationService();

        OrderService orderService = new OrderService(paymentService, notificationService);
        OrderController orderController = new OrderController(orderService);

        orderService.placeOrder();
    }
}
