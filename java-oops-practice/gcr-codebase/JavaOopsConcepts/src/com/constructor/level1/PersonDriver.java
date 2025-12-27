package com.constructor.level1;

public class PersonDriver {

    public static void main(String[] args) {

        Person person1 = new Person("Priya", 22);
        
        // Creating a clone using copy constructor
        Person person2 = new Person(person1);

        System.out.println("Original Person:");
        System.out.println(person1.getName() + " - " + person1.getAge());
        System.out.println("\nCloned Person:");
        System.out.println(person2.getName() + " - " + person2.getAge());
    }
}

