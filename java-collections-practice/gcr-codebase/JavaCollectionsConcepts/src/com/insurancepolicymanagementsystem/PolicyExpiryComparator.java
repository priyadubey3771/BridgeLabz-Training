package com.insurancepolicymanagementsystem;

import java.util.Comparator;

//sorts policies by expiry date
class PolicyExpiryComparator implements Comparator<Policy> 
{
 @Override
 public int compare(Policy p1, Policy p2) 
 {
	 // if expiry dates are same, compare policy numbers
     int result = p1.getExpiryDate().compareTo(p2.getExpiryDate());

     if (result == 0) 
     {
         return Integer.compare(p1.getPolicyNumber(), p2.getPolicyNumber());
     }

     return result;
 }
}
