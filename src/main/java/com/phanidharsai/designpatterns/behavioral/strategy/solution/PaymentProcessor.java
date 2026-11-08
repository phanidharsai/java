package com.phanidharsai.designpatterns.behavioral.strategy.solution;

import java.util.Objects;

public class PaymentProcessor {
  private PaymentStrategy paymentStrategy; // Reference to a payment strategy
  // Constructor to set the payment strategy
  public PaymentProcessor(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = Objects.requireNonNull(
            paymentStrategy,
            "Payment strategy is not configured."
    );  }

  // Process payment using the current strategy
  public void processPayment() {
    paymentStrategy
        .processPayment(); // Delegate the payment processing to the strategy
  }

  // Dynamically change payment strategy at runtime
  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }
}