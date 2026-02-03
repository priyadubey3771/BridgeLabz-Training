package com.markmate;

import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> marks; // subject -> score
    private int total;
    private double average;
    private String grade;

    public Student(String name, Map<String, Integer> marks) {
        this.name = name;
        this.marks = marks;
        calculateResults();
    }

    private void calculateResults() 
    {
        total = marks.values().stream().mapToInt(Integer::intValue).sum();
        average = (double) total / marks.size();

        if (average >= 90) 
        {
        	grade = "A+";
        }
        else if (average >= 80) 
        {
        	grade = "A";
        }
        else if (average >= 70) 
        {
        	grade = "B";
        }
        else if (average >= 60) 
        {
        	grade = "C";
        }
        else 
        {
        	grade = "D";
        }
    }

    // Getters for JSON serialization
    public String getName() 
    { 
    	return name; 
    }
    public Map<String, Integer> getMarks() 
    { 
    	return marks; 
    }
    public int getTotal() 
    { 
    	return total; 
    }
    public double getAverage() 
    { 
    	return average; 
    }
    public String getGrade() 
    { 
    	return grade; 
    }
}
