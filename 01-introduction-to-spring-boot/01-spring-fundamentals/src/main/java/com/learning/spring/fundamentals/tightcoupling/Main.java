package main.java.com.learning.spring.fundamentals.tightcoupling;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder();
    }
}
