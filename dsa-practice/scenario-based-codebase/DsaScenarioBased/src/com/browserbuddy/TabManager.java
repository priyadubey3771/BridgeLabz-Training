package com.browserbuddy;

import java.util.Stack;
//manages recently closed tabs
class TabManager {

 private Stack<String> closedTabs = new Stack<>();

 // close a tab
 public void closeTab(String url) 
 {
     closedTabs.push(url);
     System.out.println("Tab closed: " + url);
 }

 // reopen last closed tab
 public String reopenTab() 
 {
	 if (closedTabs.isEmpty()) 
	 {
         System.out.println("No closed tabs to restore.");
         return null;
     }

     String restored = closedTabs.pop();
     System.out.println("Reopened tab: " + restored);
     return restored;
 }
}
