package com.regex.extractcurrencyvaluesfromtext;

public class Driver{
  public static void main(String[] args){
    	
        CurrencyExtractor ce = new CurrencyExtractor();

        String text = "The price is $45.99, and the discount is 10.50.";
        ce.extractCurrency(text);
    }
}
