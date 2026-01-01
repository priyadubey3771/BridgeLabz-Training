package com.objectmodeling;

public class UniversityDriver {
public static void main(String[] args) {

     // Creating Faculty
     Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
     Faculty f2 = new Faculty("Dr. Mehta", "Mathematics");

     // Creating University
     University university = new University("Global Tech University");

     // Creating Department1 objects, Composition
     Department1 cs = new Department1("Computer Science");
     Department1 math = new Department1("Mathematics");

     // Adding departments to university
     university.addDepartment(cs);
     university.addDepartment(math);

     // Adding faculty to university, Aggregation
     university.addFaculty(f1);
     university.addFaculty(f2);

     // Display university details
     university.displayUniversityDetails();

     // Delete university
     university.deleteUniversity();

     // Faculty still exists independently
     System.out.println("\nFaculty exists independently:");
     f1.displayFacultyDetails();
 }
}
