package com.functionalinterfaces.paymentgatewayintegration;

public class PayPal implements PaymentProcessor {

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }

    @Override
    public void refund(double amount) 
    {
        System.out.println("PayPal refunded ₹" + amount + " to the user.");
    }
}
