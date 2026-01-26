package com.javastreams.filterstreams;

public class Driver{
    public static void main(String[] args)
    {
        UpperToLowerHandler ulh = new UpperToLowerHandler();

        String source = "C:/Users/hp/Downloads/Driver.java";
;      
        String destination = "C:/Users/hp/Downloads/output.txt"; 

        ulh.convertToLowerCase(source, destination);
    }
}
