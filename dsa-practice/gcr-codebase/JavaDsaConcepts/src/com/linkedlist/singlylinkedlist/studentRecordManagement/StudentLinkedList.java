package com.linkedlist.singlylinkedlist.studentRecordManagement;

public class StudentLinkedList {

 // Head of the linked list
 private StudentNode head;

 //Add at Beginning
 public void addAtBeginning(int rollNo, String name, int age, char grade) 
 {

     // Create new node
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);

     // Point new node to current head
     newNode.next = head;

     // Update head
     head = newNode;
 }

 // Add at End 
 public void addAtEnd(int rollNo, String name, int age, char grade) 
 {

     StudentNode newNode = new StudentNode(rollNo, name, age, grade);

     // If list is empty
     if (head == null) 
     {
         head = newNode;
         return;
     }

     // Traverse till last node
     StudentNode temp = head;
     while (temp.next != null) 
     {
         temp = temp.next;
     }

     // Link last node to new node
     temp.next = newNode;
 }

 //Add at Specific Position 
 public void addAtPosition(int position, int rollNo, String name, int age, char grade) 
 {

     // If position is first or list is empty
     if (position <= 1 || head == null) 
     {
         addAtBeginning(rollNo, name, age, grade);
         return;
     }

     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     StudentNode temp = head;

     // Move to the required position
     for (int i = 1; i < position - 1 && temp.next != null; i++) 
     {
         temp = temp.next;
     }

     // Adjust pointers
     newNode.next = temp.next;
     temp.next = newNode;
 }

 //Delete by Roll Number 
 public void deleteByRollNo(int rollNo) 
 {

     // If list is empty
     if (head == null) 
     {
         System.out.println("List is empty.");
         return;
     }

     // If head node needs to be deleted
     if (head.rollNo == rollNo) 
     {
         head = head.next;
         System.out.println("Student deleted successfully.");
         return;
     }

     StudentNode temp = head;
     StudentNode prev = null;

     // Search for the node
     while (temp != null && temp.rollNo != rollNo) 
     {
         prev = temp;
         temp = temp.next;
     }

     // If student not found
     if (temp == null) 
     {
         System.out.println("Student not found.");
         return;
     }

     // Remove node
     prev.next = temp.next;
     temp.next = null;

     System.out.println("Student deleted successfully.");
 }

 //Search by Roll Number
 public void searchByRollNo(int rollNo) 
 {

     StudentNode temp = head;

     while (temp != null) 
     {
         if (temp.rollNo == rollNo) 
         {
             displayStudent(temp);
             return;
         }
         temp = temp.next;
     }

     System.out.println("Student not found.");
 }

 //Update Student Grade
 public void updateGrade(int rollNo, char newGrade) 
 {

     StudentNode temp = head;

     while (temp != null) 
     {
         if (temp.rollNo == rollNo) 
         {
             temp.grade = newGrade;
             System.out.println("Grade updated successfully.");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Student not found.");
 }

 //Display All Students
 public void displayAll()
 {

     // If list is empty
     if (head == null) 
     {
         System.out.println("No student records available.");
         return;
     }

     StudentNode temp = head;
     while (temp != null) 
     {
         displayStudent(temp);
         temp = temp.next;
     }
 }

 // Helper Method
 private void displayStudent(StudentNode node) 
 {
     System.out.println("Roll No: " + node.rollNo +", Name: " + node.name +", Age: " + node.age +", Grade: " + node.grade);
 }
}
