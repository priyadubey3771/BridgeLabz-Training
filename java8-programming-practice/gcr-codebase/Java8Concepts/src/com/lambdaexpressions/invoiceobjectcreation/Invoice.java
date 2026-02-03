package com.lambdaexpressions.invoiceobjectcreation;

class Invoice {
	
    String transactionId;

    public Invoice(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() 
    {
        return "Invoice for Transaction ID: " + transactionId;
    }
}
