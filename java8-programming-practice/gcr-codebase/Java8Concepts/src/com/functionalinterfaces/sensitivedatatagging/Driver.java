package com.functionalinterfaces.sensitivedatatagging;

public class Driver {
  public static void main(String[] args) {

        UserCredentials user = new UserCredentials("Priya", "pass@123");
        BankDetails bank = new BankDetails("1234567890");
        PublicInfo info = new PublicInfo("Welcome to the portal");

        EncryptionProcessor.process(user);
        EncryptionProcessor.process(bank);
        EncryptionProcessor.process(info);
    }
}
