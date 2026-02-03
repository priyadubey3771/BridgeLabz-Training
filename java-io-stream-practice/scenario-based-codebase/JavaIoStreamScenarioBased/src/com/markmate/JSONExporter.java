package com.markmate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONExporter {

    public static void exportToJSON(List<Student> students, String jsonFilePath) 
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(jsonFilePath)) 
        {
            gson.toJson(students, writer);
            System.out.println("JSON report generated at: " + jsonFilePath);
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing JSON file: " + e.getMessage());
        }
    }
}
