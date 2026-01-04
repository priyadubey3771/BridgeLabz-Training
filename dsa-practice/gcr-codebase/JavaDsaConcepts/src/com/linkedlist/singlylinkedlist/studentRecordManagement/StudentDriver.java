package com.linkedlist.singlylinkedlist.studentRecordManagement;

public class StudentDriver {
  public static void main(String[] args) {

     StudentLinkedList list = new StudentLinkedList();

     // Adding students
     list.addAtBeginning(1, "Amit", 20, 'A');
     list.addAtEnd(2, "Neha", 21, 'B');
     list.addAtEnd(3, "Rahul", 22, 'C');

     System.out.println("All Students:");
     list.displayAll();
     System.out.println("\nSearching Roll No 2:");
     list.searchByRollNo(2);
     System.out.println("\nUpdating Grade of Roll No 3:");
     list.updateGrade(3, 'A');
     System.out.println("\nDeleting Roll No 1:");
     list.deleteByRollNo(1);
     System.out.println("\nFinal Student List:");
     list.displayAll();
 }
}
