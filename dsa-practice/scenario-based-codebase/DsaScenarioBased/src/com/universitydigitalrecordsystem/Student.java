package com.universitydigitalrecordsystem;

class Student {

    int roll;
    String name;
    Student left, right;

    Student(int roll, String name) 
    {
        this.roll = roll;
        this.name = name;
        left = right = null;
    }

    void display() 
    {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}
