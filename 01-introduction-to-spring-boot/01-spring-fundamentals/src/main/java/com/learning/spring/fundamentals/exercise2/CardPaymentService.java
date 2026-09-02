package main.java.com.learning.spring.fundamentals.exercise2;

public class CardPaymentService implements PaymentService {
    private final PaymentRepository paymentRepository;

    public CardPaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing card payment");
        paymentRepository.savePayment();
    }
}