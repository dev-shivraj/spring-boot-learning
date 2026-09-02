package main.java.com.learning.spring.fundamentals.rebuild;

public class MySQLPaymentRepository implements PaymentRepository{
    @Override
    public void save() {
        System.out.println("Payment saving to MySQL database");
    }
}
