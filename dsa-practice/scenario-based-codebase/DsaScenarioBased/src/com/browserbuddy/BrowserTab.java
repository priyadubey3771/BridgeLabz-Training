package com.browserbuddy;

//browserTab manages back and forward navigation
class BrowserTab {

 private HistoryNode current; 

 // open a new page
 public void visit(String url) 
 {
	 HistoryNode newPage = new HistoryNode(url);

     // if current page exists then link new page
     if (current != null) 
     {
         current.next = newPage;
         newPage.prev = current;
     }

     // Move current pointer to new page
     current = newPage;

     System.out.println("Visited: " + url);
 }

 // navigate backward
 public void back() 
 {
	 if (current != null && current.prev != null) 
	 {
         current = current.prev;
         System.out.println("Back to: " + current.url);
     } 
	 else 
	 {
         System.out.println("No previous page available.");
     }
 }

 // navigate forward
 public void forward() 
 {

     if (current != null && current.next != null) 
     {
         current = current.next;
         System.out.println("Forward to: " + current.url);
     } 
     else 
     {
         System.out.println("No forward page available.");
     }
 }

 // get current page URL
 public String getCurrentPage() 
 {
     return current != null ? current.url : "No page open";
 }
}
