package com.linkedlist.circularlinkedlist.roundRobinSchedulingAlgorithm;

public class RoundRobinDriver {
  public static void main(String[] args) {

     RoundRobinScheduler scheduler = new RoundRobinScheduler();

     // Add processes
     scheduler.addProcess(1, 10, 1);
     scheduler.addProcess(2, 5, 2);
     scheduler.addProcess(3, 8, 1);

     // Fixed time quantum
     int timeQuantum = 3;
    // Simulate scheduling
     scheduler.simulateScheduling(timeQuantum);
 }
}
