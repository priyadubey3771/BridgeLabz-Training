package com.collections.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Driver {
  public static void main(String[] args) {

        // creating a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // adding elements to queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // display original queue
        System.out.println("Original Queue: " + queue);

        // reverse the queue
        QueueReverser.reverseQueue(queue);

        // display reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}
