package com.phanidharsai.lldpractice;

public class PayPal implements PaymentStrategy{
    @Override
    public PaymentResult processPayment(double amount) {
        PaymentResult paymentResult= new PaymentResult(PaymentStatus.PAYMENT_FAILED, "unsuccessfull paypal");
        return paymentResult;
    }
}
