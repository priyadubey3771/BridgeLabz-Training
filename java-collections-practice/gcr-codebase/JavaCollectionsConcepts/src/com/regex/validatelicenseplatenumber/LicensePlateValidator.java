package com.regex.validatelicenseplatenumber;

import java.util.regex.Pattern;

class LicensePlateValidator
{
    void validateLicensePlate(String plate)
    {
        String regex = "^[A-Z]{2}[0-9]{4}$";

        boolean isValid = Pattern.matches(regex, plate);

        if (isValid)
        {
            System.out.println(plate + " → Valid");
        }
        else
        {
            System.out.println(plate + " → Invalid");
        }
    }
}
