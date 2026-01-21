package com.eduresults;

class Student {
	
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() 
    {
        System.out.println(rollNo + "  " + name + "  " + marks);
    }
    
}
