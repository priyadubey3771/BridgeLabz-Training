package com.basicsystemtasks;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BasicSystemTasks {
   public static void main(String[] args) {

	        // 1. Lambda to run a task in a separate thread
	        Runnable task = () -> System.out.println("Task is running in a separate thread");
	        Thread t = new Thread(task);
	        t.start();

	        System.out.println("-----");

	        // 2. Lambda to print numbers from a list
	        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
	        numbers.forEach(n -> System.out.println(n));

	        System.out.println("-----");

	        // 3. Lambda to check if a number is even or odd
	        Predicate<Integer> isEven = n -> n % 2 == 0;
	        numbers.forEach(n -> {
	            if (isEven.test(n))
	                System.out.println(n + " is Even");
	            else
	                System.out.println(n + " is Odd");
	        });

	        System.out.println("-----");

	        // 4. Lambda to add two numbers
	        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
	        System.out.println("Addition: " + add.apply(5, 7));

	        System.out.println("-----");

	        // 5. Lambda to find greater of two numbers
	        BiFunction<Integer, Integer, Integer> greater = (a, b) -> (a > b) ? a : b;
	        System.out.println("Greater number: " + greater.apply(10, 25));
	    }
	}


