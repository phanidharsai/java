package com.phanidharsai.designpatterns.behavioral.strategy.problem;

public class PayPalPayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing PayPal payment...");
  }
}