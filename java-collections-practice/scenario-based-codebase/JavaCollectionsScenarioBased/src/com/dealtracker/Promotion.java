package com.dealtracker;

public class Promotion {
    protected String code;
    protected int discount;

    public Promotion(String code, int discount) 
    {
        this.code = code;
        this.discount = discount;
    }

    public String getCode() 
    { 
    	return code; 
    }
    public int getDiscount() 
    { 
    	return discount;
    }

    @Override
    public String toString() 
    {
        return code + " -> " + discount + "%";
    }
}
