package com.phanidharsai.lldpractice;

import java.util.ArrayList;
import java.util.List;

public class CustomerValidator extends AbstractPaymentValidator {
    List<String> blockedUsers = new ArrayList<>();
    @Override
    public boolean validate(PaymentRequest paymentRequest) {
        this.setNext(new FraudDetectionValidator());
        System.out.println("in customer check");
        return !("123".equals(paymentRequest.customerId));
    }
}
