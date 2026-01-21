package com.collections.mapinterface.GroupObjectsByProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Driver {
  public static void main(String[] args) {

        // employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        EmployeeGrouper grouper = new EmployeeGrouper();

        // group employees by department
        Map<String, List<Employee>> grouped = grouper.groupByDepartment(employees);

        // display grouped employees
        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }
}
