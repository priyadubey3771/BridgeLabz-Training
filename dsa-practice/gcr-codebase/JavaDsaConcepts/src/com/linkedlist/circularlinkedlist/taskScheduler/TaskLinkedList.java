package com.linkedlist.circularlinkedlist.taskScheduler;

public class TaskLinkedList {

 private TaskNode head;
 private TaskNode tail;
 private TaskNode current;

 // Constructor
 public TaskLinkedList() 
 {
     head = null;
     tail = null;
     current = null;
 }

 // Add task at beginning
 public void addAtBeginning(int id, String name, int priority, String dueDate)
 {
     TaskNode newNode = new TaskNode(id, name, priority, dueDate);

     if (head == null) 
     {
         head = tail = newNode;
         newNode.next = head;
     }
     else 
     {
         newNode.next = head;
         tail.next = newNode;
         head = newNode;
     }
 }

 // Add task at end
 public void addAtEnd(int id, String name, int priority, String dueDate) {
     TaskNode newNode = new TaskNode(id, name, priority, dueDate);

     if (head == null) 
     {
         head = tail = newNode;
         newNode.next = head;
     } 
     else 
     {
         tail.next = newNode;
         newNode.next = head;
         tail = newNode;
     }
 }

 // Add task at specific position
 public void addAtPosition(int position, int id, String name, int priority, String dueDate) {

     if (position <= 1 || head == null) 
     {
         addAtBeginning(id, name, priority, dueDate);
         return;
     }

     TaskNode currentNode = head;
     int count = 1;

     while (count < position - 1 && currentNode.next != head) 
     {
         currentNode = currentNode.next;
         count++;
     }

     TaskNode newNode = new TaskNode(id, name, priority, dueDate);
     newNode.next = currentNode.next;
     currentNode.next = newNode;

     if (currentNode == tail) 
     {
         tail = newNode;
     }
 }

 // Remove task by Task ID
 public void removeByTaskId(int taskId) {

     if (head == null) 
     {
         System.out.println("Task list is empty");
         return;
     }

     TaskNode temp = head;
     TaskNode prev = tail;

     do {
         if (temp.taskId == taskId) 
         {

             // If only one node exists
             if (head == tail) 
             {
                 head = tail = null;
             }
             // If deleting head
             else if (temp == head) 
             {
                 head = head.next;
                 tail.next = head;
             }
             // If deleting tail or middle
             else 
             {
                 prev.next = temp.next;
                 if (temp == tail) 
                 {
                     tail = prev;
                 }
             }

             System.out.println("Task removed: " + taskId);
             return;
         }

         prev = temp;
         temp = temp.next;

     } 
     while (temp != head);
    System.out.println("Task not found: " + taskId);
 }

 // View current task and move to next task
 public void viewNextTask() {

     if (head == null) 
     {
         System.out.println("No tasks available");
         return;
     }

     if (current == null) 
     {
         current = head;
     }

     displayTask(current);
     current = current.next;
 }

 // Display all tasks starting from head
 public void displayAllTasks() {

     if (head == null) 
     {
         System.out.println("No tasks to display");
         return;
     }

     TaskNode temp = head;
     System.out.println("\nAll Tasks:");

     do 
     {
         displayTask(temp);
         temp = temp.next;
     } 
     while (temp != head);
 }

 // Search task by priority
 public void searchByPriority(int priority) {

     if (head == null) 
     {
         System.out.println("No tasks available");
         return;
     }

     TaskNode temp = head;
     boolean found = false;

     do 
     {
         if (temp.priority == priority)
         {
             displayTask(temp);
             found = true;
         }
         temp = temp.next;
      } 
     while (temp != head);

     if (!found)
     {
         System.out.println("No tasks found with priority: " + priority);
     }
 }

 // Helper method to display a task
 private void displayTask(TaskNode task) {
     System.out.println("Task ID: " + task.taskId + ", Name: " + task.taskName + ", Priority: " + task.priority + ", Due Date: " + task.dueDate);
 }
}
