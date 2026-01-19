package com.collections.listinterface.rotateelementsinlist;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        // creating input list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int rotateBy = 2;

        // rotating list
        List<Integer> rotatedList = ListRotationUtil.rotateLeft(numbers, rotateBy);

        // display results
        System.out.println("Original List: " + numbers);
        System.out.println("Rotated by " + rotateBy + ": " + rotatedList);
    }
}
