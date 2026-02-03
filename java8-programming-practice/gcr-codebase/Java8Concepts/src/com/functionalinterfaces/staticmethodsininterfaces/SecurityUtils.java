package com.functionalinterfaces.staticmethodsininterfaces;

public interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        if (password.length() < 8) 
        {
            return false;
        }

        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[@#$%^&+=!].*");

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
