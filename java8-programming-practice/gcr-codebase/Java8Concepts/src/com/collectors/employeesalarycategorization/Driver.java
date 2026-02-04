package com.collectors.employeesalarycategorization;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Aman", "IT", 60000),
                new Employee("Priya", "HR", 50000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Sneha", "Finance", 65000),
                new Employee("Vikram", "HR", 55000));

        // Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        // Print result
        avgSalaryByDept.forEach((dept, avgSalary) ->System.out.println(dept + " : " + avgSalary));
    }
}
