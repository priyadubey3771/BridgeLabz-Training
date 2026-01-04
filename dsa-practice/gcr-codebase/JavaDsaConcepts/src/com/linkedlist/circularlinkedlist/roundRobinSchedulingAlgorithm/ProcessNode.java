package com.linkedlist.circularlinkedlist.roundRobinSchedulingAlgorithm;

public class ProcessNode {

 int processId;
 int burstTime;
 int remainingTime;
 int priority;

 // Pointer to next process (circular)
 ProcessNode next;

 // Constructor
 public ProcessNode(int processId, int burstTime, int priority) 
 {
     this.processId = processId;
     this.burstTime = burstTime;
     this.remainingTime = burstTime; // initially same as burst time
     this.priority = priority;
     this.next = null;
 }
}
