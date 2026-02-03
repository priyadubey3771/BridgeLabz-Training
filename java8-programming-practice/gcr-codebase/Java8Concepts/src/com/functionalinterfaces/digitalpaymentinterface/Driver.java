package com.functionalinterfaces.digitalpaymentinterface;

public class Driver {
    public static void main(String[] args) {

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(1500);
        card.pay(2500);
        wallet.pay(500);
        
    }
}
