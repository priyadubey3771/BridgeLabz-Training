package com.lambdaexpressions.nameuppercasing;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
    	
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Charlie"));

        // Convert all names to uppercase
        List<String> upperNames = employees.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Employee Names in Uppercase:");
        upperNames.forEach(System.out::println);
        
    }
}
