package com.filereader;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

public class CountTheOccurrenceOfWordInFile {
    public static void main(String[] args) {

    String filePath = "C:\\Users\\hp\\Downloads\\Driver.java";  
    String targetWord = "java";

    int count = 0;

	    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
	    {
	
	        String line;
	        // Reading file line by line
	        while ((line = br.readLine()) != null)
	        {
	
	            // Split line into words
	            String[] words = line.split("\\s+");
	
	            // Check each word
	            for (String word : words) 
	            {
	                if (word.equalsIgnoreCase(targetWord)) 
	                {
	                    count++;
	                }
	            }
	        }
	
	        System.out.println("Word \"" + targetWord + "\" occurs " + count + " times.");
	
	   } 
	    catch (IOException e) 
	    {
	        System.out.println("Error reading file: " + e.getMessage());
	    }
	    
		        
	 }
}



