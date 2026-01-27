package com.regex.extractallcapitalizedwordsfromsentence;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class CapitalWordExtractor
{
    void extractCapitalWords(String text)
    {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Capitalized words found:");

        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
