package com.javastreams.readlargefilelinebyline;

public class Driver{
    public static void main(String[] args){
    	
        LargeFileReader lfr = new LargeFileReader();

        String filePath = "C:/Users/hp/Downloads/Driver.java"; 
        lfr.printErrorLines(filePath);
    }
}
