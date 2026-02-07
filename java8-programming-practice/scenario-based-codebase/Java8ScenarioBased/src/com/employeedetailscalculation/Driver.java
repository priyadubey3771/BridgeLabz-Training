package com.employeedetailscalculation;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {
  public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 25, "Male", "Sales", 2018, 30000),
            new Employee(2, "Neha", 28, "Female", "HR", 2016, 35000),
            new Employee(3, "Ravi", 30, "Male", "Product Development", 2014, 50000),
            new Employee(4, "Priya", 26, "Female", "Sales", 2019, 28000),
            new Employee(5, "Karan", 24, "Male", "Product Development", 2020, 27000),
            new Employee(6, "Sneha", 32, "Female", "HR", 2013, 45000),
            new Employee(7, "Arjun", 29, "Male", "Sales", 2015, 38000),
            new Employee(8, "Pooja", 27, "Female", "Product Development", 2017, 42000));

        // 1. Male & Female count
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        // 2. All departments
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        // 3. Average age by gender
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))));

        // 4 Highest paid employee
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        // 5. Joined after 2015
        employees.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        // 6. Count in each department
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

        // 7. Average salary of each department
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));

        // 8. Youngest male in Product Development
        employees.stream().filter(e -> e.getGender().equals("Male")&& e.getDepartment().equals("Product Development"))
                .min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);

        // 9. Most experienced employee
        employees.stream().min(Comparator.comparing(Employee::getYearOfJoining)).ifPresent(System.out::println);

        // 10. Male & Female in Sales
        System.out.println(employees.stream().filter(e -> e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        // 11. Average salary by gender
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))));

        // 12. Names in each department
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList()))));

        // 13. Average & total salary
        DoubleSummaryStatistics stats = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Total: " + stats.getSum());

        // 14. Salary > 25k
        employees.stream().filter(e -> e.getSalary() > 25000).forEach(System.out::println);
        
        // 15. highest paid employee in the organization?
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        // 16. Second highest paid
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);

        // 17. Third highest paid
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().ifPresent(System.out::println);

        // 18. Lowest paid
        employees.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        // 19. Second lowest paid
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().ifPresent(System.out::println);

        // 20. First five lowest paid
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(5).forEach(System.out::println);

        // 21. First five highest paid
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).forEach(System.out::println);
    }
}
