package com.inheritance.assistedproblems;

public class EmployeeDriver {
   public static void main(String[] args){

        //references
        Employee emp1 = new Manager("Amit", 101, 80000, 10);
        Employee emp2 = new Developer("Priya", 102, 60000, "Java");
        Employee emp3 = new Intern("Rahul", 103, 15000, 6);

        // Array of employees
        Employee[] employees = { emp1, emp2, emp3 };

        // Displaying details using polymorphism
        for (Employee emp : employees) 
        {
            System.out.println(" ");
            emp.displayDetails();
        }
    }
}
