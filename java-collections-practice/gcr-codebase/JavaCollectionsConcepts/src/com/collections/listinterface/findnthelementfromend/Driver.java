package com.collections.listinterface.findnthelementfromend;

import java.util.LinkedList;

public class Driver {
  public static void main(String[] args) {

     // creating a LinkedList
     LinkedList<String> list = new LinkedList<>();
     list.add("A");
     list.add("B");
     list.add("C");
     list.add("D");
     list.add("E");

     int n = 2;

     // finding the Nth element from the end
     String result = NthElementFinder.findNthFromEnd(list, n);

     // display result
     System.out.println("LinkedList: " + list);
     System.out.println("Nth element from end: " + result);
 }
}
