package com.linkedlist.circularlinkedlist.taskScheduler;

public class TaskDriver {
  public static void main(String[] args) {

     TaskLinkedList scheduler = new TaskLinkedList();

     // Add tasks
     scheduler.addAtBeginning(1, "Design Module", 1, "2024-02-10");
     scheduler.addAtEnd(2, "Implement Code", 2, "2024-02-15");
     scheduler.addAtEnd(3, "Testing", 3, "2024-02-20");

     // Add task at specific position
     scheduler.addAtPosition(2, 4, "Review", 2, "2024-02-12");
     // Display all tasks
     scheduler.displayAllTasks();
     // View current and next tasks
     System.out.println("\nViewing Tasks Circularly:");
     scheduler.viewNextTask();
     scheduler.viewNextTask();
     scheduler.viewNextTask();
     // Search by priority
     System.out.println("\nSearch by Priority 2:");
     scheduler.searchByPriority(2);
     // Remove a task
     scheduler.removeByTaskId(1);
     // Display final task list
     scheduler.displayAllTasks();
 }
}
