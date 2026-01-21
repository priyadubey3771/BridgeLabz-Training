package com.gamerzone;

public class GamerZoneDriver {
  public static void main(String[] args) {

     // player list after a match
     Player[] players = {  new Player("Arjun", 2450), new Player("Neha", 3200), new Player("Rohan", 1980), new Player("Simran", 3200), new Player("Kabir", 2750)};

     // display scores before sorting
     System.out.println("Before Leaderboard Update:");
     for (Player p : players) 
     {
         p.display();
     }

     // apply Quick Sort
     QuickSort.sort(players, 0, players.length - 1);

     // display leaderboard
     System.out.println("\nLeaderboard (High to Low Scores):");
     for (Player p : players) 
     {
         p.display();
     }
     
 }
}
