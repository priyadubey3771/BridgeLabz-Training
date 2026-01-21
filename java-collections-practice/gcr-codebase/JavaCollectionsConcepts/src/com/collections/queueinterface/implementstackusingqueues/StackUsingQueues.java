package com.collections.queueinterface.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

// stack implementation using two queues
class StackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Constructor
    public StackUsingQueues() 
    {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // push element into stack
    public void push(int x) 
    {
    	// add element to empty queue2
        queue2.add(x);

        // move all elements from queue1 to queue2
        while (!queue1.isEmpty()) 
        {
            queue2.add(queue1.remove());
        }

        // swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // pop element from stack
    public int pop() 
    {
    	if (queue1.isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1;
        }

        // remove top element
        return queue1.remove();
    }

    // get top element without removing
    public int top()
    {
    	if (queue1.isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return queue1.peek();
    }

    // check if stack is empty
    public boolean isEmpty() 
    {
        return queue1.isEmpty();
    }
}
