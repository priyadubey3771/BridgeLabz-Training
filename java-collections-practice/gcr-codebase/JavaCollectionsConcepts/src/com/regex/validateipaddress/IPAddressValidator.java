package com.regex.validateipaddress;

import java.util.regex.Pattern;

class IPAddressValidator
{
    void validateIPAddress(String ip)
    {
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        boolean isValid = Pattern.matches(regex, ip);

        if (isValid)
        {
            System.out.println(ip + " → Valid IPv4 address");
        }
        else
        {
            System.out.println(ip + " → Invalid IPv4 address");
        }
    }
}
