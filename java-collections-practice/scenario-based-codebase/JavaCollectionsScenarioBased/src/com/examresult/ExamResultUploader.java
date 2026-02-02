package com.examresult;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader {

    private static final String REGEX = "\\d+,\\w+,\\w+,\\d+";

    public static Map<String, List<Integer>> processFile(String filePath) throws Exception 
    {
    	Map<String, List<Integer>> subjectMarks = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine(); // skip header

        while ((line = br.readLine()) != null) 
        {
            try 
            {
                if (!Pattern.matches(REGEX, line)) 
                {
                    throw new InvalidFormatException("Invalid line: " + line);
                }

                String[] parts = line.split(",");

                String subject = parts[2];
                int marks = Integer.parseInt(parts[3]);

                subjectMarks.computeIfAbsent(subject, k -> new ArrayList<>()).add(marks);

            } 
            catch (Exception e) 
            {
                System.out.println("Skipping -> " + e.getMessage());
            }
        }

        br.close();
        return subjectMarks;
    }

    public static void printTopScorers(Map<String, List<Integer>> data) {

        for (String subject : data.keySet()) 
        {
        	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(data.get(subject));
            System.out.println(subject + " Top Score: " + pq.peek());
        }
    }
}
