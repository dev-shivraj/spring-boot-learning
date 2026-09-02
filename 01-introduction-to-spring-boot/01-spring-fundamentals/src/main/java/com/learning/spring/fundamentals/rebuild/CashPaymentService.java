package main.java.com.learning.spring.fundamentals.rebuild;

public class CashPaymentService implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment!");
    }
}
