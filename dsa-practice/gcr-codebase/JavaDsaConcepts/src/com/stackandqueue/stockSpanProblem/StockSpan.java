package com.stackandqueue.stockSpanProblem;

import java.util.Stack;
public class StockSpan {

    public int[] calculateSpan(int[] prices) 
    {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < n; i++)
        {
            // Pop indices while current price is higher than price at top of stack
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) 
            {
                stack.pop();
            }

            // If stack is empty all previous prices are smaller
            if (stack.isEmpty()) 
            {
                span[i] = i + 1;
            } 
            else 
            {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }
}
