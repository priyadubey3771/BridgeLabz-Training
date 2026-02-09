package com.studentschoolsystem;

import java.util.*;

public class Driver {
   public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Sagar", 20, 75, 3),
                new Student("Neha", 17, 45, 5),
                new Student("Aman", 22, 82, 1),
                new Student("Riya", 19, 60, 4),
                new Student("Kunal", 16, 30, 6));

        // 1. Lambda to print welcome message
        students.forEach(s ->System.out.println("Welcome to the school, " + s.getName()));

        System.out.println("-----");

        // 2. Lambda to check pass or fail (pass if marks >= 50)
        students.forEach(s -> {
            if (s.getMarks() >= 50)
                System.out.println(s.getName() + " : Pass");
            else
                System.out.println(s.getName() + " : Fail");
        });

        System.out.println("-----");

        // 3. Sort students by name using lambda
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        students.forEach(System.out::println);

        System.out.println("-----");

        // 4. Sort students by rank using lambda
        students.sort((s1, s2) -> Integer.compare(s1.getRank(), s2.getRank()));
        students.forEach(System.out::println);

        System.out.println("-----");

        // 5. Display students whose age is above 18
        students.forEach(s -> {
            if (s.getAge() > 18)
                System.out.println(s);
        });
    }
}
