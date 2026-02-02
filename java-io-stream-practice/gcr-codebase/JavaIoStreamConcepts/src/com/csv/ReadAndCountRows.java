package com.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountRows{
    public static void main(String[] args) {

        String filePath = "employee.csv";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {

            String line;

            // Read and skip header
            br.readLine();

            // Count remaining lines
            while ((line = br.readLine()) != null) 
            {
                if (!line.trim().isEmpty()) 
                {
                    rowCount++;
                }
            }

            System.out.println("Total number of employee records: " + rowCount);

        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
