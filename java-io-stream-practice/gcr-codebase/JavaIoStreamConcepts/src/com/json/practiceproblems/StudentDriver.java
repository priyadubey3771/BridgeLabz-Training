package com.json.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

public class StudentDriver {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Student student = new Student();
        student.setName("Priya");
        student.setAge(22);
        student.setSubjects(Arrays.asList("Math", "Physics", "Chemistry"));

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student));
    }
}

class Student {
    private String name;
    private int age;
    private java.util.List<String> subjects;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public java.util.List<String> getSubjects() { return subjects; }
    public void setSubjects(java.util.List<String> subjects) { this.subjects = subjects; }
}
