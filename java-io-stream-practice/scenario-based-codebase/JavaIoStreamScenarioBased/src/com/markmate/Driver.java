package com.markmate;

import java.util.List;

public class Driver {
  public static void main(String[] args) {
	  
        String csvPath = "students.csv"; 
        String jsonPath = "report_cards.json"; 

        // Read students from CSV
        List<Student> students = CSVReader.readStudents(csvPath);

        // Export to JSON
        JSONExporter.exportToJSON(students, jsonPath);
    }
}
