package com.markmate;

import java.io.*;
import java.util.*;

public class CSVReader {

    public static List<Student> readStudents(String csvFilePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) 
        {
            String line;
            String[] headers = br.readLine().split(",");
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                Map<String, Integer> marks = new HashMap<>();
                for (int i = 1; i < data.length; i++) 
                {
                    try 
                    {
                        marks.put(headers[i].trim(), Integer.parseInt(data[i].trim()));
                    } 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("⚠ Invalid mark for " + name + " in " + headers[i] + ". Setting to 0.");
                        marks.put(headers[i].trim(), 0);
                    }
                }
                students.add(new Student(name, marks));
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return students;
    }
}
