package com.regex.censorbadwordsinsentence;

public class Driver{
  public static void main(String[] args){
    	
        BadWordCensor bwc = new BadWordCensor();

        String text = "This is a damn bad example with some stupid words.";
        bwc.censorBadWords(text);
        
    }
}
