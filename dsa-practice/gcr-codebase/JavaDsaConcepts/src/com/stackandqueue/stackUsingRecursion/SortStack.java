package com.stackandqueue.stackUsingRecursion;

import java.util.Stack;
  public class SortStack {

    // Method to sort the stack
    public void sort(Stack<Integer> stack) 
    {
        if (stack.isEmpty())
        {
            return;
        }

        int top = stack.pop();
        sort(stack);
        insertInSortedOrder(stack, top);
    }

    // Helper method to insert element in sorted order
    private void insertInSortedOrder(Stack<Integer> stack, int element) 
    {
        if (stack.isEmpty() || stack.peek() <= element) 
        {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(top);
    }
}
