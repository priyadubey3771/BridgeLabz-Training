package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
  public static void main(String[] args) {

    String filePath = "C:\\Users\\hp\\Downloads\\Driver.java";

    try 
    {
        // Create FileReader
        FileReader fr = new FileReader(filePath);

        // Wrap FileReader with BufferedReader
        BufferedReader br = new BufferedReader(fr);

        String line;

        // Read file line by line
        while ((line = br.readLine()) != null) 
        {
            System.out.println(line);
        }

        // Close resources
        br.close();
        fr.close();

     } 
    catch (IOException e) 
    {
        System.out.println("Error reading file: " + e.getMessage());
    }
    
    
    }
}
