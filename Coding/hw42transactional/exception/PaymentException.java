package Coding.hw42transactional.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message){
        super(message);
    }
}
