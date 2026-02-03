package com.functionalinterfaces.paymentgatewayintegration;

public class Razorpay implements PaymentProcessor {

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using Razorpay.");
    }
}
