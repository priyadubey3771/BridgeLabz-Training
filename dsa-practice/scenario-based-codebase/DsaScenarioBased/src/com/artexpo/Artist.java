package com.artexpo;

//represents an artist registering for the expo
class Artist {

 String artistName;
 int registrationTime;   

 // constructor
 public Artist(String artistName, int registrationTime) 
 {
     this.artistName = artistName;
     this.registrationTime = registrationTime;
 }

 // display artist details
 public void display() 
 {
     System.out.println(artistName + " registered at " + registrationTime);
 }
}
