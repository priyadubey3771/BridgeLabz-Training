package com.csv.MergeTwoCSVFiles;

import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";

        Map<Integer, StudentBasic> map = new HashMap<>();

        // Read students1.csv
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) 
        {
            
        	// skip header
        	br.readLine(); 
            String line;

            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);

                map.put(id, new StudentBasic(id, name, age));
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file1: " + e.getMessage());
        }

        // Read students2.csv and merge
        try 
        (
            BufferedReader br = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) 
        {
        	bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                int marks = Integer.parseInt(data[1]);
                String grade = data[2];

                StudentBasic sb = map.get(id);

                if (sb != null) 
                {
                    bw.write(id + "," + sb.name + "," + sb.age + "," + marks + "," + grade);
                    bw.newLine();
                }
            }

            System.out.println("Files merged successfully into merged_students.csv");

        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file2: " + e.getMessage());
        }
    }
}
