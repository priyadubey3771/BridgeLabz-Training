package com.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {
  public static void main(String[] args) {

        int characterLimit = 20;

        // Function to calculate string length
        Function<String, Integer> getLength = message -> message.length();

        String message = "Java functional interfaces are powerful";

        int length = getLength.apply(message);

        if (length > characterLimit) 
        {
            System.out.println("Message exceeds the character limit. Length: " + length);
        } 
        else 
        {
            System.out.println("Message is within the limit. Length: " + length);
        }
    }
}
