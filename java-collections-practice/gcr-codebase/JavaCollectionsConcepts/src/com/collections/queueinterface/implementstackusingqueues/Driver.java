package com.collections.queueinterface.implementstackusingqueues;

public class Driver {
  public static void main(String[] args) {

     StackUsingQueues stack = new StackUsingQueues();

     // push elements
     stack.push(1);
     stack.push(2);
     stack.push(3);

     // pop element
     System.out.println("Popped element: " + stack.pop());

     // top element
     System.out.println("Top element: " + stack.top());
     
 }
}
