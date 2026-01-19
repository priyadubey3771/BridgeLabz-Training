package com.collections.listinterface.findnthelementfromend;

import java.util.LinkedList;

class NthElementFinder {

 // method to find the Nth element from the end without using size()
 public static String findNthFromEnd(LinkedList<String> list, int n) {

     // pointer that moves n steps ahead
     int frontPointer = 0;

     // pointer that will reach the required element
     int backPointer = 0;

     for (int i = 0; i < n; i++) 
     {
         frontPointer++;
     }

     // move both pointers until front pointer reaches end
     while (frontPointer < list.size()) 
     {
         frontPointer++;
         backPointer++;
     }

     // back pointer now points to the Nth element from the end
     return list.get(backPointer);
 }
}
