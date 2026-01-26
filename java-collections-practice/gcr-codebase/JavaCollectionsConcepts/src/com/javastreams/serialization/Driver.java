package com.javastreams.serialization;

import java.util.ArrayList;

public class Driver{
   public static void main(String[] args){
	   
        EmployeeHandler eh = new EmployeeHandler();

        // Create some employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 55000));

        String fileName = "employees.dat";

        // Save employees to file
        eh.saveEmployees(fileName, employees);

        // Load and display employees from file
        eh.loadEmployees(fileName);
    }
}
