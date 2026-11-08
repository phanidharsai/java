package com.phanidharsai.lldpractice;

public class PaymentRequest {
    double amount;
    String customerId;
    PaymentType paymentType;
    PaymentRequest(double amount, String customerId,PaymentType paymentType){
        this.amount = amount;
        this.customerId= customerId;
        this.paymentType=paymentType;
    }
}
