package com.stackandqueue.slidingWindowMaximum;

import java.util.Arrays;
public class Driver {
   public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        SlidingWindowMaximum slidingWindow = new SlidingWindowMaximum();
        int[] maxInWindows = slidingWindow.maxSlidingWindow(nums, k);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Sliding Window Maximums: " + Arrays.toString(maxInWindows));
    }
}
