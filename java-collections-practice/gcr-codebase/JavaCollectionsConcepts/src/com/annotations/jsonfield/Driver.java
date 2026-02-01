package com.annotations.jsonfield;

public class Driver {
  public static void main(String[] args) {

        User user = new User(101, "Priya", "priya@email.com");

        String json = JsonConverter.toJson(user);

        System.out.println(json);
    }
}
