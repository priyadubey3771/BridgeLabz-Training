package com.regex.extractcurrencyvaluesfromtext;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class CurrencyExtractor
{
    void extractCurrency(String text)
    {
        String regex = "\\$?\\d+(\\.\\d{1,2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Currency values found:");

        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
