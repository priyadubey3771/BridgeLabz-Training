package com.challengeproblem;

	import java.io.*;
	import java.nio.charset.StandardCharsets;

public class Comparison {
   public static void main(String[] args) {

        //StringBuilder vs StringBuffer
        int n = 1_000_000;

        // StringBuilder test
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) 
        {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();

        // StringBuffer test
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for(int i = 0; i < n; i++) 
        {
            sbuf.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));
        System.out.println("StringBuffer Time  (ns): " + (endBuffer - startBuffer));

        //FileReader vs InputStreamReader
        String filePath = "C:\\Users\\hp\\Downloads\\Driver.java";

        // FileReader test
        long startFileReader = System.nanoTime();
        long wordCountFR = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();

        // InputStreamReader test
        long startISR = System.nanoTime();
        long wordCountISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        System.out.println("\nWord Count (FileReader): " + wordCountFR);
        System.out.println("FileReader Time (ns): " + (endFileReader - startFileReader));
        System.out.println("\nWord Count (InputStreamReader): " + wordCountISR);
        System.out.println("InputStreamReader Time (ns): " + (endISR - startISR));
    }

    // Method using FileReader
    private static long countWordsUsingFileReader(String path) 
    {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }

        return count;
    }

    // Method using InputStreamReader
    private static long countWordsUsingInputStreamReader(String path) 
    {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) 
        {

            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) 
                {
                    count += words.length;
                }
            }
        } 
        catch (IOException e) 
        {
            System.out.println("InputStreamReader error: " + e.getMessage());
	    }

	        return count;
	 }
}



