package com.regex.validatehexcolorcode;

import java.util.regex.Pattern;

class HexColorValidator
{
    void validateHexColor(String color)
    {
        String regex = "^#[0-9A-Fa-f]{6}$";

        boolean isValid = Pattern.matches(regex, color);

        if (isValid)
        {
            System.out.println(color + " → Valid");
        }
        else
        {
            System.out.println(color + " → Invalid");
        }
    }
}

