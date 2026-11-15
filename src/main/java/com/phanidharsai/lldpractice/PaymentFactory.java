package com.phanidharsai.lldpractice;

import java.util.Map;
import java.util.function.Supplier;


public class PaymentFactory {
    private static final Map<PaymentType, Supplier<PaymentStrategy>>  strategies =
            Map.of(PaymentType.CREDIT_CARD, CreditCard:: new,
                    PaymentType.UPI, UPI:: new,
                    PaymentType.PAYPAL, PayPal:: new);

    public static PaymentStrategy getStrategy(PaymentType paymentType) {
        Supplier<PaymentStrategy> strategy = strategies.get(paymentType);
        if (strategy == null) {
            throw new IllegalArgumentException("unsupported payment type "+ paymentType);
        }
        return strategy.get();

    }
}