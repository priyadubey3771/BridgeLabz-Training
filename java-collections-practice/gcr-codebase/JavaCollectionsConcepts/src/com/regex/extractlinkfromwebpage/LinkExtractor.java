package com.regex.extractlinkfromwebpage;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class LinkExtractor
{
    void extractLinks(String text)
    {
        String regex = "https?://[\\w.-]+(?:/\\S*)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Links found:");

        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
