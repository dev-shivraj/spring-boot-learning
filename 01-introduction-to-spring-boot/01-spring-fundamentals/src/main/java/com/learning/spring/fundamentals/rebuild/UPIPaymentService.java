package main.java.com.learning.spring.fundamentals.rebuild;

public class UPIPaymentService implements PaymentService{
    private PaymentRepository paymentRepository;

    public UPIPaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment");
        paymentRepository.save();
    }
}
