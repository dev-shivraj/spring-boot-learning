package main.java.com.learning.spring.fundamentals.rebuild;


public class OrderController {
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder() {
        orderService.placeOrder();
    }
}
