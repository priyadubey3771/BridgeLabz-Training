package com.hashmapsandhashfunctions.pairwithgivensuminarray;

public class Driver {
  public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, -8};
        int target = 16;
        PairSumCheck checker = new PairSumCheck();
        boolean exists = checker.hasPairWithSum(arr, target);

        if (exists) 
        {
            System.out.println("Pair with sum " + target + " exists.");
        } 
        else 
        {
            System.out.println("No pair with sum " + target + " found.");
        }
    }
}
