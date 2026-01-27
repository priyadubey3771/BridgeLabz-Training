package com.regex.extractallemailaddressesfromtext;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class EmailExtractor
{
    void extractEmails(String text)
    {
        // Regex for basic email validation
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Emails found in text:");

        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
