package com.regex.censorbadwordsinsentence;

import java.util.regex.Pattern;

class BadWordCensor
{
    void censorBadWords(String text)
    {
        // List of bad words
        String[] badWords = {"damn", "stupid"};

        String censoredText = text;

        // Replace each bad word with **** 
        for (String word : badWords)
        {
            censoredText = censoredText.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        System.out.println("Censored text:");
        System.out.println(censoredText);
    }
}
