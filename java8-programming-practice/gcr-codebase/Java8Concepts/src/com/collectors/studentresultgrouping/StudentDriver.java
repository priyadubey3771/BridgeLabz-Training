package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDriver {
   public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Aman", "A"),
                new Student("Priya", "B"),
                new Student("Rahul", "A"),
                new Student("Sneha", "C"),
                new Student("Vikram", "B"),
                new Student("Neha", "A")
        );

        // Group students by grade and collect their names
        Map<String, List<String>> result = students.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName, Collectors.toList())));

        // Print the result
        result.forEach((grade, names) ->System.out.println("Grade " + grade + " : " + names));
    }
}
