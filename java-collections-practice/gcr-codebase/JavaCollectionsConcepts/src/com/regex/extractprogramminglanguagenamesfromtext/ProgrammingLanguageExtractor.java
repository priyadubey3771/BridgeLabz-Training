package com.regex.extractprogramminglanguagenamesfromtext;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ProgrammingLanguageExtractor
{
    void extractLanguages(String text)
    {
        // List of programming languages to match
        String[] languages = {"Java", "Python", "JavaScript", "Go"};
        System.out.println("Programming languages found:");

        for (String lang : languages)
        {
            // Regex with word boundaries for exact match
            String regex = "\\b" + lang + "\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find())
            {
                System.out.println(matcher.group());
            }
        }
    }
}
