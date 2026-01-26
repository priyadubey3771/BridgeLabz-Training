package com.javastreams.filehandling;

public class Driver{
  public static void main(String[] args){
	  
        FileHandler fh = new FileHandler();
        fh.copyFile("C:\\Users\\hp\\Downloads\\Driver.java", "destination.txt");  
        fh.displayFile("destination.txt");             
    }
}
