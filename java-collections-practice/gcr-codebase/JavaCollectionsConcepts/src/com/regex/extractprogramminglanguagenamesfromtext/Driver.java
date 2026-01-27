package com.regex.extractprogramminglanguagenamesfromtext;

public class Driver{
   public static void main(String[] args){
    	
        ProgrammingLanguageExtractor ple = new ProgrammingLanguageExtractor();

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        ple.extractLanguages(text);
    }
}
