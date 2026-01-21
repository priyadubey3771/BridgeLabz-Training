package com.designvotingsystem;

//represents a vote for a candidate
public class Vote {

	 private String candidateName;
	
	 public Vote(String candidateName) 
	 {
	     this.candidateName = candidateName;
	 }
	
	 public String getCandidateName() 
	 {
	     return candidateName;
	 }
 
}
