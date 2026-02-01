package com.reflection.generatejsonrepresentation;

public class Driver {
 public static void main(String[] args) {

        Student student = new Student(101, "Priya", 91.2);

        String json = JsonUtil.toJson(student);

        System.out.println(json);
    }
}
