package com.javastreams.datastreams;

public class Driver{
    public static void main(String[] args){
    	
        StudentDataHandler sdh = new StudentDataHandler();

        String fileName = "students.dat";

        // Save some student data
        sdh.saveStudentData(fileName, 101, "Alice", 9.2);
        sdh.saveStudentData(fileName, 102, "Bob", 8.5);
        sdh.saveStudentData(fileName, 103, "Charlie", 9.0);

        // Load and display student data
        sdh.loadStudentData("C:\\Users\\hp\\Downloads\\destNormal.dat");

    }
}
