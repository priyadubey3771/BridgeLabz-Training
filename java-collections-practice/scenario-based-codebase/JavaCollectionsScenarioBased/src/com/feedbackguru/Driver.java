package com.feedbackguru;

import java.util.*;

public class Driver {
   public static void main(String[] args) {

        Map<String, List<String>> result = FeedbackGuru.analyzeFolder("feedback", "Service");

        System.out.println("=== Feedback Summary ===");

        for (Map.Entry<String, List<String>> entry : result.entrySet()) 
        {
            System.out.println("\n" + entry.getKey() + " Feedback:");
            for (String msg : entry.getValue()) 
            {
                System.out.println(msg);
            }
        }
    }
}
