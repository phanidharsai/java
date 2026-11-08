package com.phanidharsai.lldpractice;

public interface PaymentValidator {
    void setNext(PaymentValidator paymentValidator);
    boolean handle(PaymentRequest paymentRequest);
}
