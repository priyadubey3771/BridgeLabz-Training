package com.linkedlist.singlylinkedlist.studentRecordManagement;

//This class represents a single student record

public class StudentNode 
{

 int rollNo;          
 String name;         
 int age;             
 char grade;          
 StudentNode next;  

 // Constructor to initialize student details
 public StudentNode(int rollNo, String name, int age, char grade) 
 {
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.next = null; 
 }
}
