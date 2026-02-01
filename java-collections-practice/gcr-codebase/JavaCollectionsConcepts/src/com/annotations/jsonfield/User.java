package com.annotations.jsonfield;

public class User {

    @JsonField(name = "user_id")
    private int id;

    @JsonField(name = "user_name")
    private String name;
    private String email; 

    public User(int id, String name, String email) 
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
