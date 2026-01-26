package com.javastreams.countwordsinfile;

public class Driver{
    public static void main(String[] args){
    	
        WordCounter wc = new WordCounter();
        String filePath = "C:\\Users\\hp\\Downloads\\Driver.java";
        wc.countWords(filePath);
    }
}
