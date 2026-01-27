package com.exceptionhandling.checkedexception;

public class Driver{
   public static void main(String[] args){
	   
        FileReaderHandler frh = new FileReaderHandler();

        String filePath = "C:\\Users\\hp\\Downloads\\Driver.java"; 
        frh.readFile(filePath);
    }
}
