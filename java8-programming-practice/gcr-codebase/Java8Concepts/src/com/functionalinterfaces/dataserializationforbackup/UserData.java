package com.functionalinterfaces.dataserializationforbackup;

public class UserData implements BackupEligible {

    private String username;

    public UserData(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
}
