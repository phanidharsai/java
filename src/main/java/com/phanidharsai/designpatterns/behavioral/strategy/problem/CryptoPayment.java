package com.phanidharsai.designpatterns.behavioral.strategy.problem;

public class CryptoPayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing crypto payment...");
  }
}