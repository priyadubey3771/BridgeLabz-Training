package com.regex.validatecreditcardnumber;

import java.util.regex.Pattern;

class CreditCardValidator
{
    void validateCard(String cardNumber)
    {
        String regex = "^(4\\d{15}|5\\d{15})$";

        boolean isValid = Pattern.matches(regex, cardNumber);

        if (isValid)
        {
            System.out.println(cardNumber + " → Valid Credit Card (Visa/MasterCard)");
        }
        else
        {
            System.out.println(cardNumber + " → Invalid Credit Card");
        }
    }
}
