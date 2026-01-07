package com.linearsearch;

public class SearchSpecificWord {
 public static void main(String[] args) {

        String[] sentences = {"Java is easy to learn","I love data structures", "Linear search is simple","Practice makes perfect"};
        String word = "search";
        String result = findSentenceContainingWord(sentences, word);
        System.out.println(result);
    }

    // Linear Search method
    public static String findSentenceContainingWord(String[] sentences, String word)
    {

        for (int i = 0; i < sentences.length; i++)
        {

            // Check if sentence contains the word
            if (sentences[i].toLowerCase().contains(word.toLowerCase())) 
            {
                return sentences[i];
            }
        }

        return "Not Found";
    }
}
