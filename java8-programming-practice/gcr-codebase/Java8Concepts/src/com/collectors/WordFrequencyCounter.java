package com.collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
  public static void main(String[] args) {

	 String paragraph = "Java is simple and Java is powerful and Java is widely used";

	 // Convert paragraph into words and count frequency
	    Map<String, Integer> wordFrequency = Arrays.stream(paragraph.toLowerCase().split("\\W+"))
	    .collect(Collectors.toMap(Function.identity(), word -> 1, Integer::sum ));

	// Print the result
	    wordFrequency.forEach((word, count) ->System.out.println(word + " : " + count));
	        
	    }
	}


