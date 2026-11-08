package com.phanidharsai.lldpractice;

public class AmountValidator extends AbstractPaymentValidator {

    @Override
    public boolean validate(PaymentRequest paymentRequest) {
        double amount = paymentRequest.amount;
        System.out.println("in amount check");
        this.setNext(new CustomerValidator());
        return amount >= 1 && amount <= 99999;
    }
}
