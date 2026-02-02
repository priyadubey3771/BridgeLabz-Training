package com.chatlogparser;

import java.util.*;

public class Driver {
  public static void main(String[] args) throws Exception {

        Map<String, List<String>> result = ChatLogParser.parseChat("chatlog.txt",new IdleChatFilter());

        System.out.println("=== Filtered Chat Logs ===");

        for (Map.Entry<String, List<String>> e : result.entrySet()) 
        {
            System.out.println("\nUser: " + e.getKey());
            for (String msg : e.getValue()) 
            {
                System.out.println(msg);
            }
        }
    }
}
