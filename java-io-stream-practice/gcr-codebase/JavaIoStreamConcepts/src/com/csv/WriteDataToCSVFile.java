package com.csv;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToCSVFile {
  public static void main(String[] args) {

        String filePath = "employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) 
        {
        	// Writing employee records in CSV format
            bw.write("201,Priya,HR,45000");
            bw.newLine();

            bw.write("202,Rahul,IT,60000");
            bw.newLine();

            bw.write("203,Anita,Finance,55000");
            bw.newLine();

            bw.write("204,Arjun,Marketing,50000");
            bw.newLine();

            bw.write("205,Sneha,IT,65000");
            bw.newLine();

            System.out.println("Employee records written successfully to employees.csv");

        } 
        catch (IOException e) 
        {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}



