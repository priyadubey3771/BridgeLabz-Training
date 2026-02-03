package com.functionalinterfaces.dataserializationforbackup;

public class TransactionData implements BackupEligible {

    private String transactionId;

    public TransactionData(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }
}
