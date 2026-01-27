package com.regex.validatesocialsecuritynumber;

import java.util.regex.Pattern;

class SSNValidator
{
    void validateSSN(String ssn)
    {
        // Regex for SSN in format XXX-XX-XXXX
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        boolean isValid = Pattern.matches(regex, ssn);

        if (isValid)
        {
            System.out.println(ssn + " → Valid SSN");
        }
        else
        {
            System.out.println(ssn + " → Invalid SSN");
        }
    }
}
