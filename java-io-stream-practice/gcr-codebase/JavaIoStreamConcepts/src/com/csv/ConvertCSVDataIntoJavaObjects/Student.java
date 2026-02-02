package com.csv.ConvertCSVDataIntoJavaObjects;

class Student {
    int id;
    String name;
    int age;
    int marks;

    public Student(int id, String name, int age, int marks) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() 
    {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks;
    }
}
