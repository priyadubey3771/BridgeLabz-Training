package com.csv;

import java.io.*;
public class ModifyCSVFile {
  public static void main(String[] args) {

    String inputFile = "employees.csv";
    String outputFile = "updated_employees.csv";

    try 
    (
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
    ) 
    {
    	String line;

        // Read and write header
        line = br.readLine();
        bw.write(line);
        bw.newLine();

        while ((line = br.readLine()) != null) 
        {

            if (line.trim().isEmpty()) 
            {
                continue;
            }

            String[] data = line.split(",");

            String id = data[0];
            String name = data[1];
            String department = data[2];
            double salary = Double.parseDouble(data[3]);

            // Increase salary by 10% for IT department
            if (department.equalsIgnoreCase("IT"))
            {
                salary = salary + (salary * 0.10);
            }

            // Write updated record
            bw.write(id + "," + name + "," + department + "," + (int) salary);
            bw.newLine();
        }

        System.out.println("Updated records saved to updated_employees.csv");

    }
    catch (IOException e) 
    {
        System.out.println("Error: " + e.getMessage());
    }
  }
}


