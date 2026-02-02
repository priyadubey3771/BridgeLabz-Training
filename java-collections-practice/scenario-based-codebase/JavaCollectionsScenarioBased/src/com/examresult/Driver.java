package com.examresult;

import java.util.*;

public class Driver {
  public static void main(String[] args) throws Exception {

        Map<String, List<Integer>> result = ExamResultUploader.processFile("marks.csv");

        System.out.println("=== Subject-wise Marks ===");
        System.out.println(result);

        System.out.println("\n=== Top Scorers ===");
        ExamResultUploader.printTopScorers(result);
    }
}
