package com.collections.mapinterface.wordfrequencycounter;

import java.util.Map;

public class Driver {
  public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        WordFrequencyCounter counter = new WordFrequencyCounter();

        // count word frequencies
        Map<String, Integer> result = counter.countWords(text);

        System.out.println(result);
        
    }
}
