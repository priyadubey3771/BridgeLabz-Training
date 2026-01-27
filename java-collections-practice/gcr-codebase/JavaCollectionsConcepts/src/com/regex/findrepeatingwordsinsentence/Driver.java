package com.regex.findrepeatingwordsinsentence;

public class Driver{
    public static void main(String[] args){
    	
        RepeatingWordFinder rwf = new RepeatingWordFinder();
        String text = "This is is a repeated repeated word test.";
        rwf.findRepeatingWords(text);
        
    }
}
