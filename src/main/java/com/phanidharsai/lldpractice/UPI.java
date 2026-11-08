package com.phanidharsai.lldpractice;

public class UPI implements PaymentStrategy{
    @Override
    public PaymentResult processPayment(double amount) {
        PaymentResult paymentResult= new PaymentResult(true, "successfull upi payment");
        return paymentResult;
    }
}
