package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru {

    private static final String RATING_REGEX = "(\\d{1,2})/10";

    public static <T> Map<String, List<String>> analyzeFolder(String path, T type) {

        Map<String, List<String>> categorized = new HashMap<>();
        categorized.put("Positive", new ArrayList<>());
        categorized.put("Neutral", new ArrayList<>());
        categorized.put("Negative", new ArrayList<>());

        File folder = new File(path);
        File[] files = folder.listFiles();

        if (files == null) return categorized;

        for (File file : files) 
        {
            try {
                if (!file.getName().endsWith(".txt")) 
                {
                    continue;
                }

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                while ((line = br.readLine()) != null) 
                {
                    try 
                    {
                        int rating = extractRating(line);

                        Feedback<T> feedback = new Feedback<>(type, line, rating);

                        String category = getCategory(rating);
                        categorized.get(category).add(feedback.getMessage());

                    } 
                    catch (Exception e) 
                    {
                        // Skip invalid line
                        System.out.println("Skipping line: " + line);
                    }
                }

                br.close();

            } 
            catch (IOException e) 
            {
                System.out.println("Error reading file: " + file.getName());
            }
        }

        return categorized;
    }

    private static int extractRating(String text) 
    {
        Matcher m = Pattern.compile(RATING_REGEX).matcher(text);
        if (m.find()) 
        {
            return Integer.parseInt(m.group(1));
        }
        throw new IllegalArgumentException("No rating found");
    }

    private static String getCategory(int rating) 
    {
        if (rating >= 8) return "Positive";
        if (rating >= 5) return "Neutral";
        return "Negative";
    }
}

