package main.java.com.learning.spring.fundamentals.exercise2;

public class MySqlPaymentRepository implements PaymentRepository {
    @Override
    public void savePayment() {
        System.out.println("Payment saved in MySQL");
    }
}