package com.examcell;

// represents a student
class Student {

    String studentId;
    String name;
    int score;

    // Constructor
    public Student(String studentId, String name, int score) 
    {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    // Display student details
    public void display() 
    {
        System.out.println(studentId + " | " + name + " | Score: " + score);
    }
}
