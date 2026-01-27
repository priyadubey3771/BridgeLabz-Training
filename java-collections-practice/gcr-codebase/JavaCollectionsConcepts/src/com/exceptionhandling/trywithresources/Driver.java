package com.exceptionhandling.trywithresources;

public class Driver{
   public static void main(String[] args){
    	
        FileLineReader flr = new FileLineReader();

        String filePath = "C:\\Users\\hp\\Downloads\\Driver.java";
        flr.readFirstLine(filePath);
    }
}
