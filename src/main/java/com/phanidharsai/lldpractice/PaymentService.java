package com.phanidharsai.lldpractice;

import java.util.Objects;

public class PaymentService {
    private PaymentStrategy paymentStrategy;
    private final PaymentValidator paymentValidator;

    PaymentService(PaymentValidator paymentValidator) {
        this.paymentValidator = Objects.requireNonNull(paymentValidator, "payment validator type " +
                "is null");
    }

    public PaymentResult processPayment(PaymentRequest paymentRequest) {
        if (paymentStrategy == null) {
            throw new IllegalStateException(
                    "Please select a payment method"
            );
        }
        if (paymentValidator.handle(paymentRequest)) {
            return paymentStrategy.processPayment(paymentRequest.amount);

        }
        return new PaymentResult(PaymentStatus.VALIDATION_FAILED, "validation failed");
    }

    public PaymentResult setPaymentMethod(PaymentType paymentType) {
        try {
            PaymentStrategy strategy = PaymentFactory.getStrategy(paymentType);
            this.paymentStrategy = strategy;
        } catch (IllegalArgumentException e) {
            return new PaymentResult(PaymentStatus.INVALID_PAYMENT_TYPE, e.getMessage());
        }
        return new PaymentResult(PaymentStatus.PAYMENT_METHOD_SELECTED,"proceeding for payment");

    }
//    public void setPaymentValidator(PaymentValidatorType paymentValidatorType){
//        this.paymentValidator=PaymentValidatorFactory.
//    }
}
