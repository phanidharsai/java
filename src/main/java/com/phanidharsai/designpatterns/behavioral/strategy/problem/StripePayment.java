package com.phanidharsai.designpatterns.behavioral.strategy.problem;

public class StripePayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing Stripe payment...");
  }
}