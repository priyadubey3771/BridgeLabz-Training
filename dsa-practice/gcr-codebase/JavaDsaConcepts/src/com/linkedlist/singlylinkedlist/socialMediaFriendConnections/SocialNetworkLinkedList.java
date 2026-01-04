package com.linkedlist.singlylinkedlist.socialMediaFriendConnections;

public class SocialNetworkLinkedList {

 private UserNode head;

 // Add new user
 public void addUser(int id, String name, int age) 
 {
     UserNode newUser = new UserNode(id, name, age);

     if (head == null) 
     {
         head = newUser;
     } 
     else 
     {
         UserNode temp = head;
         while (temp.next != null) 
         {
             temp = temp.next;
         }
         temp.next = newUser;
     }
 }

 // Find user by ID
 private UserNode findUserById(int id) 
 {
     UserNode temp = head;
     while (temp != null) 
     {
         if (temp.userId == id) 
         {
             return temp;
         }
         temp = temp.next;
     }
     return null;
 }

 // Add friend connection
 public void addFriendConnection(int id1, int id2)
 {

     UserNode user1 = findUserById(id1);
     UserNode user2 = findUserById(id2);

     if (user1 == null || user2 == null) 
     {
         System.out.println("User not found");
         return;
     }

     user1.addFriend(id2);
     user2.addFriend(id1);

     System.out.println("Friend connection added between " + id1 + " and " + id2);
 }

 // Remove friend connection
 public void removeFriendConnection(int id1, int id2) 
 {

     UserNode user1 = findUserById(id1);
     UserNode user2 = findUserById(id2);

     if (user1 == null || user2 == null) 
     {
         System.out.println("User not found");
         return;
     }

     user1.removeFriend(id2);
     user2.removeFriend(id1);

     System.out.println("Friend connection removed between " + id1 + " and " + id2);
 }

 // Display friends of a user
 public void displayFriends(int userId) 
 {

     UserNode user = findUserById(userId);

     if (user == null)
     {
         System.out.println("User not found");
         return;
     }

     System.out.print("Friends of " + user.name + ": ");
     for (int i = 0; i < user.friendCount; i++) 
     {
         System.out.print(user.friends[i] + " ");
     }
     System.out.println();
 }

 // Find mutual friends between two users
 public void findMutualFriends(int id1, int id2) 
 {

     UserNode user1 = findUserById(id1);
     UserNode user2 = findUserById(id2);

     if (user1 == null || user2 == null) 
     {
         System.out.println("User not found");
         return;
     }

     System.out.print("Mutual Friends: ");
     boolean found = false;

     for (int i = 0; i < user1.friendCount; i++) 
     {
         for (int j = 0; j < user2.friendCount; j++) 
         {
             if (user1.friends[i] == user2.friends[j]) 
             {
                 System.out.print(user1.friends[i] + " ");
                 found = true;
             }
         }
     }

     if (!found) 
     {
         System.out.print("None");
     }
     System.out.println();
 }

 // Search user by ID
 public void searchByUserId(int id) 
 {
     UserNode user = findUserById(id);

     if (user != null)
     {
         displayUser(user);
     } 
     else
     {
         System.out.println("User not found");
     }
 }

 // Search user by name
 public void searchByName(String name)
 {

     UserNode temp = head;
     boolean found = false;

     while (temp != null) 
     {
         if (temp.name.equalsIgnoreCase(name)) 
         {
             displayUser(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found) 
     {
         System.out.println("User not found");
     }
 }

 // Count friends for each user
 public void countFriends() 
 {

     UserNode temp = head;

     while (temp != null) 
     {
         System.out.println( temp.name + " has " + temp.friendCount + " friends" );
         temp = temp.next;
     }
 }

 // Helper method to display user
 private void displayUser(UserNode user) 
 {
     System.out.println(  "ID: " + user.userId +  ", Name: " + user.name + ", Age: " + user.age );
 }
}
