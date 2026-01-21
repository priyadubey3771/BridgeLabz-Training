package com.gamerzone;

class Player {

	 String name;
	 int score;
	
	 // constructor
	 Player(String name, int score) 
	 {
	     this.name = name;
	     this.score = score;
	 }
	
	 // display player details
	 void display() 
	 {
	     System.out.println(name + " - Score: " + score);
	 }
 
}
