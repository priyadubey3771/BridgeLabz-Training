package com.collections.setinterface.findsubsets;

import java.util.Set;

class SubsetChecker {

 // method to check whether set1 is a subset of set2
 public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) 
 {

     //true if all elements of set1 exist in set2
     return set2.containsAll(set1);
     
 }
}
