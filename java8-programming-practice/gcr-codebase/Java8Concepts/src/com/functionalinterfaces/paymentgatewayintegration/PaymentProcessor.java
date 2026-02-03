package com.functionalinterfaces.paymentgatewayintegration;

public interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount)
    {
        System.out.println("Refund of ₹" + amount + " is being processed (default).");
    }
}

