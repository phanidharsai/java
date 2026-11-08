package com.phanidharsai.lldpractice;

public class CreditCard implements PaymentStrategy {

    @Override
    public PaymentResult processPayment(double amount) {
        PaymentResult paymentResult= new PaymentResult(true, "credit card payment successfull");
         return paymentResult;
    }
}
