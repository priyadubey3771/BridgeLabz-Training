package com.dealtracker;

import java.time.LocalDate;

public class Deal extends Promotion {

    private LocalDate validTill;
    private int minPurchase;

    public Deal(String code, int discount,LocalDate validTill, int minPurchase) 
    {
        super(code, discount);
        this.validTill = validTill;
        this.minPurchase = minPurchase;
    }

    public LocalDate getValidTill() 
    { 
    	return validTill; 
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | ValidTill: " + validTill + " | MinPurchase: " + minPurchase;
    }
}
