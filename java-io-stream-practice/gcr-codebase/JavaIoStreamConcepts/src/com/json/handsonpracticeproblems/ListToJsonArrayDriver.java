package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class ListToJsonArrayDriver {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<User> users = Arrays.asList(
            new User("Priya", 22, "priya@example.com"),
            new User("Rohit", 28, "rohit@example.com")
        );

        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
        System.out.println(jsonArray);
    }
}

class User {
    private String name;
    private int age;
    private String email;

    public User() {}
    public User(String name, int age, String email) {
        this.name = name; this.age = age; this.email = email;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
}
