package com.phanidharsai.lldpractice;

import java.util.Objects;

public class PaymentService {
    private PaymentStrategy paymentStrategy;
    private final PaymentValidator paymentValidator;

    PaymentService(PaymentValidator paymentValidator){
        this.paymentValidator = Objects.requireNonNull(paymentValidator,"payment validator type " +
                "is null");
    }

    public PaymentResult processPayment(PaymentRequest paymentRequest) {
        if (paymentStrategy == null) {
            throw new IllegalStateException(
                    "Please select a payment method"
            );
        }
        if(paymentValidator.handle(paymentRequest)){
            return paymentStrategy.processPayment(paymentRequest.amount);

        }
        return new PaymentResult(false,"validation failed");
    }

    public void setPaymentMethod(PaymentType paymentType) {
        this.paymentStrategy = PaymentFactory.getStrategy(
                Objects.requireNonNull(paymentType, "Payment type cannot be null")
        );
    }
//    public void setPaymentValidator(PaymentValidatorType paymentValidatorType){
//        this.paymentValidator=PaymentValidatorFactory.
//    }
}
