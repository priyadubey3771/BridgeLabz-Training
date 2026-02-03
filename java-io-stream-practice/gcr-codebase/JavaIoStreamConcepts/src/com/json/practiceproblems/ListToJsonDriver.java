package com.json.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class ListToJsonDriver {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<StudentSimple> students = Arrays.asList(
            new StudentSimple("Priya", 22),
            new StudentSimple("Rohit", 28)
        );

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students));
    }
}

class StudentSimple {
    private String name;
    private int age;

    public StudentSimple() {}
    public StudentSimple(String name, int age) 
    { 
    	this.name = name; this.age = age; 
    }

    public String getName() 
    { 
    	return name; 
    }
    public void setName(String name) 
    { 
    	this.name = name; 
    }

    public int getAge() 
    { 
    	return age; 
    }
    public void setAge(int age) 
    { 
    	this.age = age; 
    }
}
