package com.linkedlist.singlylinkedlist.socialMediaFriendConnections;

public class UserNode {

 int userId;
 String name;
 int age;

 // Array to store friend IDs
 int[] friends;
 int friendCount;

 // Pointer to next user
 UserNode next;

 // Constructor
 public UserNode(int userId, String name, int age) 
 {
     this.userId = userId;
     this.name = name;
     this.age = age;
     this.friends = new int[10]; // max 10 friends (for simplicity)
     this.friendCount = 0;
     this.next = null;
 }

 // Add friend ID
 public void addFriend(int friendId) 
 {
     if (friendCount < friends.length) 
     {
         friends[friendCount++] = friendId;
     }
 }

 // Remove friend ID
 public void removeFriend(int friendId) 
 {
     for (int i = 0; i < friendCount; i++) 
     {
         if (friends[i] == friendId) 
         {
             for (int j = i; j < friendCount - 1; j++)
             {
                 friends[j] = friends[j + 1];
             }
             friendCount--;
             return;
         }
     }
 }
}
