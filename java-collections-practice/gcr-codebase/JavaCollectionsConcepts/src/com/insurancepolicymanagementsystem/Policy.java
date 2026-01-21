package com.insurancepolicymanagementsystem;

import java.time.LocalDate;

class Policy {

 private int policyNumber;
 private String policyHolderName;
 private LocalDate expiryDate;
 private String coverageType;        
 private double premiumAmount;

 // constructor
 public Policy(int policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount) 
 {
     this.policyNumber = policyNumber;
     this.policyHolderName = policyHolderName;
     this.expiryDate = expiryDate;
     this.coverageType = coverageType;
     this.premiumAmount = premiumAmount;
 }

 // getters
 public int getPolicyNumber() 
 {
     return policyNumber;
 }

 public LocalDate getExpiryDate() 
 {
     return expiryDate;
 }

 public String getCoverageType() 
 {
     return coverageType;
 }

 // hashCode and equals ensure uniqueness based on policy number
 @Override
 public int hashCode() 
 {
     return policyNumber;
 }

 @Override
 public boolean equals(Object obj) 
 {
     if (this == obj) return true;
     if (!(obj instanceof Policy)) return false;
     Policy other = (Policy) obj;
     return this.policyNumber == other.policyNumber;
 }

 // display policy details
 @Override
 public String toString() 
 {
     return "Policy{" + "policyNumber=" + policyNumber +  ", holder='" + policyHolderName + '\'' + ", expiry=" + expiryDate +", coverage='" + coverageType + '\'' +", premium=" + premiumAmount +'}';
 }
}
