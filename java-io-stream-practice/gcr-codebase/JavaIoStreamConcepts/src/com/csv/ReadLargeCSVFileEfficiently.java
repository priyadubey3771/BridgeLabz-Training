package com.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeCSVFileEfficiently {
  public static void main(String[] args) {

    String filePath = "employees.csv";
    int batchSize = 100;

    int totalProcessed = 0;
    int batchCount = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
    {
    	String line;

        // Skip header if present
        br.readLine();

        while (true) 
        {
            batchCount = 0;

            // Read 100 lines at a time
            while (batchCount < batchSize && (line = br.readLine()) != null) 
            {

                batchCount++;
                totalProcessed++;
            }

            if (batchCount == 0) 
            {
                break; 
            }

            System.out.println("Processed " + batchCount +" records in this batch. Total processed: " + totalProcessed);

        }

        System.out.println("\nFinished processing file. Total records: " + totalProcessed);

    } 
    catch (IOException e)
    {
        System.out.println("Error: " + e.getMessage());
        }
    }
}

