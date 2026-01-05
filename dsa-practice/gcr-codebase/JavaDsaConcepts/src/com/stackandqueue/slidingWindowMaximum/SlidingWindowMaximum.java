package com.stackandqueue.slidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        if (nums == null || k <= 0)
        return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;

        Deque<Integer> deque = new LinkedList<>(); 

        for (int i = 0; i < n; i++) 
        {

            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
            {
                deque.pollFirst();
            }

            // Remove indices whose values are less than current element
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()])
            {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Record max in result once first window is ready
            if (i >= k - 1) 
            {
                result[ri++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
