package com.phanidharsai.lldpractice;

public class FraudDetectionValidator extends AbstractPaymentValidator {
    @Override
    public boolean validate(PaymentRequest paymentRequest) {
        System.out.println("in fraud");
        return paymentRequest.amount<60000;
    }
}
