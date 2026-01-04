package com.linkedlist.circularlinkedlist.roundRobinSchedulingAlgorithm;

public class RoundRobinScheduler {

 private ProcessNode head;
 private ProcessNode tail;

 private int totalProcesses;
 private int totalWaitingTime;
 private int totalTurnaroundTime;

 // Constructor
 public RoundRobinScheduler() 
 {
     head = null;
     tail = null;
     totalProcesses = 0;
     totalWaitingTime = 0;
     totalTurnaroundTime = 0;
 }

 // Add process at end of circular list
 public void addProcess(int id, int burstTime, int priority) 
 {

     ProcessNode newNode = new ProcessNode(id, burstTime, priority);

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

     totalProcesses++;
 }

 // Remove process by Process ID
 private void removeProcess(ProcessNode prev, ProcessNode current) 
 {

     // If only one process exists
     if (current == head && current == tail) 
     {
         head = tail = null;
     }
     // Removing head
     else if (current == head) 
     {
         head = head.next;
         tail.next = head;
     }
     // Removing tail
     else if (current == tail) 
     {
         tail = prev;
         tail.next = head;
     }
     // Removing middle process
     else 
     {
         prev.next = current.next;
     }
 }

 // Simulate Round Robin Scheduling
 public void simulateScheduling(int timeQuantum) {

     if (head == null) 
     {
         System.out.println("No processes to schedule");
         return;
     }

     int currentTime = 0;
     ProcessNode current = head;
     ProcessNode prev = tail;

     System.out.println("\nRound Robin Scheduling Start ");

     while (head != null)
     {

         displayQueue();

         // Execute process
         if (current.remainingTime > timeQuantum) 
         {
             current.remainingTime -= timeQuantum;
             currentTime += timeQuantum;
         } 
         else 
         {
             currentTime += current.remainingTime;

             // Calculate turnaround & waiting time
             int turnaroundTime = currentTime;
             int waitingTime = turnaroundTime - current.burstTime;

             totalTurnaroundTime += turnaroundTime;
             totalWaitingTime += waitingTime;

             current.remainingTime = 0;

             // Remove completed process
             removeProcess(prev, current);

             current = prev.next;
             continue;
         }

         prev = current;
         current = current.next;
     }

     displayAverageTimes();
 }

 // Display processes in circular queue
 private void displayQueue() {

     if (head == null)
     return;

     ProcessNode temp = head;
     System.out.print("Queue: ");

     do 
     {
         System.out.print("[P" + temp.processId +" RT:" + temp.remainingTime + "] " );
         temp = temp.next;
     } 
     while (temp != head);

     System.out.println();
 }

 // Display average waiting & turnaround time
 private void displayAverageTimes() {

     System.out.println("\nScheduling Completed");

     double avgWaitingTime = (double) totalWaitingTime / totalProcesses;
     double avgTurnaroundTime = (double) totalTurnaroundTime / totalProcesses;
     System.out.println("Average Waiting Time: " + avgWaitingTime);
     System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
 }
}
