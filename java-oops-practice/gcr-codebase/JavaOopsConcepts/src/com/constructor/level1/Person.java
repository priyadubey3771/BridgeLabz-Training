package com.constructor.level1;

public class Person {

    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) 
    {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Getter methods
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

