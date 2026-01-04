package com.linkedlist.circularlinkedlist.taskScheduler;

public class TaskNode {

 int taskId;
 String taskName;
 int priority;
 String dueDate;

 // Pointer to next task
 TaskNode next;

 // Constructor to initialize task details
 public TaskNode(int taskId, String taskName, int priority, String dueDate) 
 {
     this.taskId = taskId;
     this.taskName = taskName;
     this.priority = priority;
     this.dueDate = dueDate;
     this.next = null;
 }
}
