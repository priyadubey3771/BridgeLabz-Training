package com.inputstreamreader;
	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadUserInputAndWriteToFile {
   public static void main(String[] args) {

    String filePath = "C:\\Users\\hp\\Downloads\\Driver.java";

    try 
    (
        // Reading input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Writing output to file
        FileWriter fw = new FileWriter(filePath, true) // true → append mode
     ) 
    {

        String input;

        System.out.println("Enter text (type 'exit' to stop):");

        // Read input until user types "exit"
        while (true) 
        {
            input = br.readLine();

            if (input.equalsIgnoreCase("exit")) 
            {
                break;
            }

            // Write input to file with new line
            fw.write(input + System.lineSeparator());
        }

        System.out.println("Input successfully written to file.");

    }
    catch (IOException e) 
    {
        System.out.println("Error: " + e.getMessage());
    }
    
    
   }
 }


