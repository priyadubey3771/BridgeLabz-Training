package com.browserbuddy;

public class BrowserBuddyDriver {
  public static void main(String[] args) {

    BrowserTab tab = new BrowserTab();
    TabManager manager = new TabManager();

    // visit pages
    tab.visit("google.com");
    tab.visit("github.com");
    tab.visit("stackoverflow.com");

    // navigate history
    tab.back();
    tab.back();
    tab.forward();

    // close current tab
    manager.closeTab(tab.getCurrentPage());

    // reopen closed tab
        String restored = manager.reopenTab();

    if(restored != null) 
    {
        tab.visit(restored);
    }
   }
}



