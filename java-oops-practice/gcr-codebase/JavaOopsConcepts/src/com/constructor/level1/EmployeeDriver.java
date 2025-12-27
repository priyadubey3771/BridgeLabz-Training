package com.constructor.level1;

public class EmployeeDriver {
  public static void main(String[] args) {

     Manager manager = new Manager("EMP1001", "IT", 80000.0, 5);

     // Displaying manager details
     manager.displayManagerDetails();

     System.out.println("\nUpdating Salary...\n");
     // Modifying salary using public setter
     manager.setSalary(85000.0);

     // Displaying updated details
     manager.displayManagerDetails();
  }
 }

