package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
   public static void main(String[] args) {

        //Employee reference
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Priya", 50000);
        emp1.assignDepartment("IT");
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Aman", 80, 300);
        emp2.assignDepartment("HR");
        employees.add(emp1);
        employees.add(emp2);

        // Processing employees using Employee reference
        for (Employee emp : employees) 
        {
            emp.displayDetails();

            // Access department through interface reference
            Department dept = (Department) emp;
            System.out.println("Department    : " + dept.getDepartmentDetails());
            System.out.println("--------------------------------");
        }
    }
}
