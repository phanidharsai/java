package com.phanidharsai.lldpractice;

public class PayPal implements PaymentStrategy{
    @Override
    public PaymentResult processPayment(double amount) {
        PaymentResult paymentResult= new PaymentResult(false, "unsuccessfull paypal");
        return paymentResult;
    }
}
