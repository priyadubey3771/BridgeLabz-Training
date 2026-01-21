package com.collections.mapinterface.wordfrequencycounter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    // method to count frequency of words in a given text
    public Map<String, Integer> countWords(String text) 
    {
    	// convert text to lowercase to ignore case
        text = text.toLowerCase();

        // remove punctuation- anything except letters and spaces
        text = text.replaceAll("[^a-z ]", "");

        // split text into words
        String[] words = text.split("\\s+");

        // HashMap to store word frequency
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count frequency of each word
        for (String word : words) 
        {
            if (wordCountMap.containsKey(word)) 
            {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } 
            else
            {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
