package com.csv.SortCSVRecordsByColumn;

import java.io.*;
import java.util.*;

public class Driver {
   public static void main(String[] args) {

        String filePath = "employees.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
        	String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) 
            {
            	if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String dept = data[2];
                int salary = Integer.parseInt(data[3]);

                employees.add(new Employee(id, name, dept, salary));
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        // Sort by salary in descending order
        employees.sort((e1, e2) -> e2.salary - e1.salary);

        // Print top 5 highest paid employees
        System.out.println("Top 5 Highest Paid Employees:\n");

        for (int i = 0; i < Math.min(5, employees.size()); i++) 
        {
            Employee e = employees.get(i);
            System.out.println("ID: " + e.id +", Name: " + e.name +", Department: " + e.department +", Salary: " + e.salary);
        }
    }
}
