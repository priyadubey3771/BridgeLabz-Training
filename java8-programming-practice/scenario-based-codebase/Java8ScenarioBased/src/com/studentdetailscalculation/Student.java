package com.studentdetailscalculation;

import java.util.List;

public class Student {

    int id;
    String name;
    String department;
    int age;
    String gender;
    String city;
    int rank;
    List<String> contacts;

    public Student(int id, String name, String department, int age,String gender, String city, int rank, List<String> contacts)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getId() 
    { 
    	return id; 
    }
    public String getName() 
    { 
    	return name;
    }
    public String getDepartment() 
    { 
    	return department; 
    }
    public int getAge() 
    {
    	return age; 
    }
    public String getGender() 
    { 
    	return gender; 
    }
    public String getCity() 
    { 
    	return city; 
    }
    public int getRank() 
    { 
    	return rank; 
    }
    public List<String> getContacts() 
    { 
    	return contacts; 
    }

    @Override
    public String toString() 
    {
        return name + " | " + department + " | Rank: " + rank;
    }
}
