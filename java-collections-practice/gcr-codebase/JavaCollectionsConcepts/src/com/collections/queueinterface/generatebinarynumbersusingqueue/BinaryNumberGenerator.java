package com.collections.queueinterface.generatebinarynumbersusingqueue;

import java.util.LinkedList;
import java.util.Queue;

class BinaryNumberGenerator {

    // method to generate first N binary numbers
    public static void generateBinaryNumbers(int n) 
    {
    	// queue to store binary numbers as strings
        Queue<String> queue = new LinkedList<>();

        // add the first binary number
        queue.add("1");

        // generate binary numbers from 1 to N
        for (int i = 1; i <= n; i++) 
        {
        	// remove the front binary number
            String current = queue.remove();

            // print the current binary number
            System.out.print(current + " ");

            // generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
