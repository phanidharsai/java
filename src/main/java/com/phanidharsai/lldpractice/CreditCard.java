package com.phanidharsai.lldpractice;

public class CreditCard implements PaymentStrategy {

    @Override
    public PaymentResult processPayment(double amount) {
        PaymentResult paymentResult= new PaymentResult(PaymentStatus.PAYMENT_SUCCESS, "credit card payment successfull");
         return paymentResult;
    }
}
