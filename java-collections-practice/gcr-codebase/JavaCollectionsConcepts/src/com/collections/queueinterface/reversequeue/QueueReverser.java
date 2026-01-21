package com.collections.queueinterface.reversequeue;

import java.util.Queue;

class QueueReverser {

 // method to reverse a queue using recursion
 public static void reverseQueue(Queue<Integer> queue) 
 {
	 //if queue is empty, return
     if (queue.isEmpty()) 
     {
         return;
     }

     // remove front element
     int element = queue.remove();

     // recursively reverse the remaining queue
     reverseQueue(queue);

     // add the removed element to the rear
     queue.add(element);
 }
}
