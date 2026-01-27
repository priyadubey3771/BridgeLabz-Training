package com.regex.extractallcapitalizedwordsfromsentence;

public class Driver{
    public static void main(String[] args){
    	
        CapitalWordExtractor cwe = new CapitalWordExtractor();

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        cwe.extractCapitalWords(text);
    }
}
