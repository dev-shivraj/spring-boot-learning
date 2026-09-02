package main.java.com.learning.spring.fundamentals.exercise2;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder() {
        orderService.placeOrder();
    }
}