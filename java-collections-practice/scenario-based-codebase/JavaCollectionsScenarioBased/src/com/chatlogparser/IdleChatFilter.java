package com.chatlogparser;
import java.util.Arrays;
import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {

    private final List<String> idleWords = Arrays.asList("lol", "brb", "haha", "ttyl", "omg");

    @Override
    public boolean filter(String message) {
        for (String word : idleWords) 
        {
            if (message.toLowerCase().contains(word)) 
            {
            	// remove idle chat
                return false;   
            }
        }
        return true;
    }
}
