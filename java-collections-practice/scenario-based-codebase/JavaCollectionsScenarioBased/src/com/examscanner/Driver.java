package com.examscanner;

import java.util.*;

public class Driver {
   public static void main(String[] args) throws Exception {

        List<String> answerKey = Arrays.asList("A","B","C","D","A","B","C");

        Map<String, Integer> result = ExamScanner.evaluate("answers.csv", answerKey, "Math");

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(result.entrySet());

        System.out.println("=== Ranking ===");
        while (!pq.isEmpty()) 
        {
            Map.Entry<String, Integer> e = pq.poll();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
