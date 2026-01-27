package com.regex.extractdates;

public class Driver{
    public static void main(String[] args){
    	
        DateExtractor de = new DateExtractor();
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        de.extractDates(text);
        
    }
}

