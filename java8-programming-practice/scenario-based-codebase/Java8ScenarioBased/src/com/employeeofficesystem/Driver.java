package com.employeeofficesystem;

import java.util.*;

public class Driver {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 35000, 5),
                new Employee("Neha", 28000, 2),
                new Employee("Ravi", 50000, 6),
                new Employee("Priya", 32000, 4),
                new Employee("Karan", 25000, 1));

        // 1. Lambda to calculate bonus (salary > 30000)
        employees.forEach(e -> {
            if (e.getSalary() > 30000) 
            {
                double bonus = e.getSalary() * 0.10; // 10% bonus
                System.out.println(e.getName() + " Bonus: " + bonus);
            }
        });

        System.out.println("-----");

        // 2. Sort employees by salary using lambda
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employees.forEach(System.out::println);

        System.out.println("-----");

        // 3. Lambda to check promotion eligibility (experience > 3 years)
        employees.forEach(e -> {
            if (e.getExperience() > 3)
                System.out.println(e.getName() + " is eligible for promotion");
        });

        System.out.println("-----");

        // 4. Lambda to print employee details
        employees.forEach(e -> System.out.println(e));

        System.out.println("-----");

        // 5. Lambda to compare two employees' salaries
        Comparator<Employee> salaryComparator = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

        Employee e1 = employees.get(0);
        Employee e2 = employees.get(1);

        if (salaryComparator.compare(e1, e2) > 0)
            System.out.println(e1.getName() + " has higher salary than " + e2.getName());
        else
            System.out.println(e2.getName() + " has higher salary than " + e1.getName());
    }
}
