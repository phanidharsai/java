package com.phanidharsai.lldpractice;

public class UPI implements PaymentStrategy{
    @Override
    public PaymentResult processPayment(double amount) {
        PaymentResult paymentResult= new PaymentResult(PaymentStatus.PAYMENT_SUCCESS, "successfull upi payment");
        return paymentResult;
    }
}
