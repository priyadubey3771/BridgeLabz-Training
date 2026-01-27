package com.regex.validateusername;

import java.util.regex.Pattern;

class UsernameValidator
{
    void validateUsername(String username)
    {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        boolean isValid = Pattern.matches(regex, username);

        if (isValid)
        {
            System.out.println(username + " → Valid");
        }
        else
        {
            System.out.println(username + " → Invalid");
        }
    }
}
