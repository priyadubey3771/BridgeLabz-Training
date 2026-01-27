package com.regex.extractdates;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class DateExtractor
{
    void extractDates(String text)
    {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Dates found:");

        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
