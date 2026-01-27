package com.regex.extractallemailaddressesfromtext;

public class Driver{
  public static void main(String[] args){
    	
        EmailExtractor ee = new EmailExtractor();

        String text = "Contact us at support@example.com and info@company.org";
        ee.extractEmails(text);
    }
}
