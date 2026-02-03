package com.functionalinterfaces.sensitivedatatagging;

public class UserCredentials implements SensitiveData {

    private String username;
    private String password;

    public UserCredentials(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }

    public String getData() 
    {
        return "Username: " + username + ", Password: " + password;
    }
}
