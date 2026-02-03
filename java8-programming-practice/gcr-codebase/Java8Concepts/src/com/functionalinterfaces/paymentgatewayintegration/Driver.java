package com.functionalinterfaces.paymentgatewayintegration;

public class Driver {
  public static void main(String[] args) {

        PaymentProcessor razorpay = new Razorpay();
        PaymentProcessor paypal = new PayPal();

        razorpay.pay(2000);
        razorpay.refund(500);  

        paypal.pay(3000);
        paypal.refund(1000);  
    }
}
