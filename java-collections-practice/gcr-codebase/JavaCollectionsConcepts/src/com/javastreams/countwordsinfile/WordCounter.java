package com.javastreams.countwordsinfile;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class WordCounter
{
    void countWords(String filePath)
    {
        BufferedReader br = null;
        HashMap<String, Integer> wordMap = new HashMap<>();

        try
        {
            br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null)
            {
                // Split line into words using non-word characters as delimiters
                String[] words = line.split("\\W+");

                for (String word : words)
                {
                    if (word.isEmpty()) continue;

                    word = word.toLowerCase(); // case-insensitive
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                }
            }

            // Convert map to list and sort by frequency descending
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordMap.entrySet());
            
            Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() 
            {
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2)
                {
                    return e2.getValue().compareTo(e1.getValue()); // descending order
                }
            });

            // Display top 5 words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : wordList)
            {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                count++;
                if (count == 5) break;
            }

        }
        catch (IOException e)
        {
            System.out.println("Error: Cannot read file.");
        }
        finally
        {
            try
            {
                if (br != null) br.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing file.");
            }
        }
    }
}
