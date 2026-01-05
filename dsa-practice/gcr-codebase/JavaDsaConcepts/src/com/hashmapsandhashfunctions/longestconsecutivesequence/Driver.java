package com.hashmapsandhashfunctions.longestconsecutivesequence;

public class Driver {
  public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2, 101};

        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        int length = lcs.findLongestSequence(arr);
        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}
