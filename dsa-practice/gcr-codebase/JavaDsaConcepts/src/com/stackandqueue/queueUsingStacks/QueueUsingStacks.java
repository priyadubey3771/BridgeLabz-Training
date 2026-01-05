package com.stackandqueue.queueUsingStacks;

import java.util.Stack;
 public class QueueUsingStacks {

    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueUsingStacks() 
    {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) 
    {
        enqueueStack.push(data);
    }

    // Dequeue operation
    public int dequeue()
    {
        if (enqueueStack.isEmpty() && dequeueStack.isEmpty()) 
        {
            System.out.println("Queue is empty");
            return -1;
        }

        if (dequeueStack.isEmpty()) 
        {
            while (!enqueueStack.isEmpty()) 
            {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }
}
