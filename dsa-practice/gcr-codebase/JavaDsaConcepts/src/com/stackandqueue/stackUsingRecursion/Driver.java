package com.stackandqueue.stackUsingRecursion;

import java.util.Stack;
public class Driver {
   public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        SortStack sorter = new SortStack();
        sorter.sort(stack);
        System.out.println("Sorted Stack (Top to Bottom):");
        
        while (!stack.isEmpty()) 
        {
            System.out.println(stack.pop());
        }
    }
}
