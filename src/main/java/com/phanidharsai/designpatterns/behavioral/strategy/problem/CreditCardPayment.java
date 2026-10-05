package com.phanidharsai.designpatterns.behavioral.strategy.problem;

public class CreditCardPayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing credit card payment...");
  }
}