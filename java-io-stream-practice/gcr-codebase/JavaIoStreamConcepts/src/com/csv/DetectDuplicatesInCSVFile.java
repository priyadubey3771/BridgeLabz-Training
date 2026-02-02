package com.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesInCSVFile {
  public static void main(String[] args) {

        String filePath = "student.csv";
        Set<Integer> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
        	String line;

            // Skip header
            br.readLine();

            System.out.println("Duplicate Records Found:\n");

            while ((line = br.readLine()) != null) 
            {
            	if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);

                // Check duplicate
                if (seenIds.contains(id)) 
                {
                    System.out.println(line);
                } 
                else 
                {
                    seenIds.add(id);
                }
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


