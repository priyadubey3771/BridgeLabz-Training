package com.linkedlist.singlylinkedlist.socialMediaFriendConnections;

public class SocialMediaDriver {
  public static void main(String[] args) {

     SocialNetworkLinkedList network = new SocialNetworkLinkedList();

     // Add users
     network.addUser(1, "Amit", 22);
     network.addUser(2, "Neha", 21);
     network.addUser(3, "Rahul", 23);
     network.addUser(4, "Priya", 20);
     // Add friend connections
     network.addFriendConnection(1, 2);
     network.addFriendConnection(1, 3);
     network.addFriendConnection(2, 3);
     network.addFriendConnection(3, 4);
     // Display friends
     network.displayFriends(1);
     // Find mutual friends
     network.findMutualFriends(1, 2);
     // Search users
     network.searchByUserId(3);
     network.searchByName("Priya");
     // Count friends
     network.countFriends();
     // Remove friend connection
     network.removeFriendConnection(1, 3);

     // Display again
     network.displayFriends(1);
 }
}
