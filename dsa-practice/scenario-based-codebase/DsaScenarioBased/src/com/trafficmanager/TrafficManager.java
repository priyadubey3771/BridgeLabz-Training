package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;
// manages roundabout and waiting queue
  public class TrafficManager {

    private Vehicle head = null;          
    private Vehicle tail = null;        

    private Queue<String> waitingQueue = new LinkedList<>();
    private final int MAX_CAPACITY = 5;  
    private int currentCount = 0;

    // add vehicle to waiting queue
    public void addToQueue(String number) {
        waitingQueue.offer(number);
        System.out.println("Vehicle " + number + " added to waiting queue.");
    }

    // move vehicle from queue to roundabout
    public void enterRoundabout() 
    {

        if (currentCount == MAX_CAPACITY) 
        {
            System.out.println("Roundabout full! Cannot enter.");
            return;
        }

        if (waitingQueue.isEmpty()) 
        {
            System.out.println("No vehicles waiting.");
            return;
        }

        String number = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) 
        {
            head = tail = newVehicle;
            newVehicle.next = head;
        } 
        else 
        {
            tail.next = newVehicle;
            newVehicle.next = head;
            tail = newVehicle;
        }

        currentCount++;
        System.out.println("Vehicle " + number + " entered roundabout.");
    }

    // remove vehicle from roundabout
    public void exitRoundabout(String number) {

        if (head == null) 
        {
            System.out.println("Roundabout empty.");
            return;
        }

        Vehicle current = head;
        Vehicle prev = tail;

        do 
        {
            if (current.number.equals(number)) 
            {

                if (current == head && current == tail) 
                {
                    head = tail = null;
                } 
                else 
                {
                    prev.next = current.next;
                    if (current == head) head = current.next;
                    if (current == tail) tail = prev;
                }

                currentCount--;
                System.out.println("Vehicle " + number + " exited roundabout.");
                return;
            }

            prev = current;
            current = current.next;

        } 
        while (current!= head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // display current state of roundabout
    public void displayRoundabout() 
    {

        if (head == null) 
        {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = head;

        do 
        {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } 
        while (temp != head);

        System.out.println("(back to start)");
    }
}
