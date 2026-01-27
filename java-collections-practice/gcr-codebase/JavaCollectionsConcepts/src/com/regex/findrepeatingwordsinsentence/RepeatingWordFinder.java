package com.regex.findrepeatingwordsinsentence;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashSet;

class RepeatingWordFinder
{
    void findRepeatingWords(String text)
    {
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatingWords = new HashSet<>();

        while (matcher.find())
        {
            repeatingWords.add(matcher.group(1));
        }

        System.out.println("Repeating words found:");
        for (String word : repeatingWords)
        {
            System.out.println(word);
        }
    }
}
