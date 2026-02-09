package com.studentdetailscalculation;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {
   public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(1, "Sagar", "Mechanical Engineering", 26, "Male", "Mumbai", 45,Arrays.asList("1111", "2222")),
            new Student(2, "Neha", "Computer Engineering", 24, "Female", "Delhi", 12,Arrays.asList("3333")),
            new Student(3, "Rohit", "Electronics Engineering", 27, "Male", "Bangalore", 78,Arrays.asList("4444", "5555")),
            new Student(4, "Sneha", "Mechanical Engineering", 29, "Female", "Mumbai", 32,Arrays.asList("6666")),
            new Student(5, "Aman", "Biotech Engineering", 23, "Male", "Karnataka", 150,Arrays.asList("7777")),
            new Student(6, "Simran", "Computer Engineering", 28, "Female", "Karnataka", 60,Arrays.asList("8888", "9999")),
            new Student(7, "Kunal", "Electronics Engineering", 22, "Male", "Mumbai", 95,Arrays.asList("1010")),
            new Student(8, "Sara", "Mechanical Engineering", 30, "Female", "Delhi", 20,Arrays.asList("2020", "3030")));

        // ---------- Basic Filtering & Mapping ----------
        students.stream().filter(s -> s.getRank() < 50).forEach(System.out::println);
        students.stream().filter(s -> s.getAge() > 25).forEach(System.out::println);
        students.stream().map(Student::getName).forEach(System.out::println);
        students.stream().filter(s -> s.getDepartment().equals("Mechanical Engineering")).forEach(System.out::println);
        students.stream().filter(s -> !s.getCity().equals("Mumbai")).forEach(System.out::println);

        // ---------- Sorting & Limiting ----------
        students.stream().sorted(Comparator.comparing(Student::getRank)).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank)).limit(5).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank).reversed()).limit(3).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRank)).forEach(System.out::println);

        // ---------- Grouping & Aggregation ----------
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getAge))));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank))));
        System.out.println("Total Students: " + students.size());

        System.out.println(
                students.stream().collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.averagingInt(Student::getRank)))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .get());

        // ---------- Min / Max / Ranking ----------
        students.stream().min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        students.stream().max(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().ifPresent(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank)).skip(2).findFirst().ifPresent(System.out::println);
        students.stream().min(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);
        students.stream().max(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);

        // ---------- FlatMap ----------
        students.stream().flatMap(s -> s.getContacts().stream()).forEach(System.out::println);
        System.out.println(students.stream().flatMap(s -> s.getContacts().stream()).count());
        students.stream().filter(s -> s.getContacts().size() > 1).forEach(System.out::println);
        students.stream().flatMap(s -> s.getContacts().stream()).distinct().forEach(System.out::println);

        // ---------- Matching ----------
        System.out.println(students.stream().anyMatch(s -> s.getDepartment().equals("Biotech Engineering")));
        System.out.println(students.stream().allMatch(s -> s.getAge() > 20));
        System.out.println(students.stream().noneMatch(s -> s.getDepartment().equals("Civil Engineering")));

        // ---------- Gender Analysis ----------
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting())));
        System.out.println(students.stream().filter(s -> s.getGender().equals("Male")).collect(Collectors.averagingInt(Student::getAge)));
        System.out.println(students.stream().filter(s -> s.getGender().equals("Female")).collect(Collectors.averagingInt(Student::getAge)));
        students.stream().filter(s -> s.getGender().equals("Male")).min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        students.stream().filter(s -> s.getGender().equals("Female")).min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);

        // ---------- Department Specific ----------
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.mapping(Student::getName, Collectors.toList()))));
        students.stream().filter(s -> s.getDepartment().equals("Computer Engineering")).min(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);
        students.stream().filter(s -> s.getDepartment().equals("Mechanical Engineering")).min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        System.out.println(students.stream().filter(s ->s.getDepartment().equals("Electronics Engineering")&& s.getCity().equals("Karnataka")).count());

        // ---------- Advanced ----------
        System.out.println(students.stream().collect(Collectors.toMap(Student::getId, Student::getName)));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment)));
        students.stream().filter(s -> s.getName().startsWith("S")).forEach(System.out::println);
        students.stream().filter(s -> s.getName().length() > 5).forEach(System.out::println);
        students.stream().filter(s -> s.getRank() % 2 == 0).forEach(System.out::println);
        students.stream().filter(s -> s.getRank() % 2 != 0).forEach(System.out::println);

        // ---------- Bonus ----------
        students.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).forEach(System.out::println);
        System.out.println(students.stream().collect(Collectors.partitioningBy(s -> s.getAge() > 25)));
        System.out.println(students.stream().collect(Collectors.partitioningBy(s -> s.getRank() < 100)));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get());
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByValue()).get());
    }
}
