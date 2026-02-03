package com.functionalinterfaces.dataserializationforbackup;

public class Driver {
  public static void main(String[] args) {

        UserData user = new UserData("Priya");
        TransactionData txn = new TransactionData("TXN123");
        TempCache cache = new TempCache("SessionData");

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(txn);
        BackupProcessor.processBackup(cache);
    }
}
