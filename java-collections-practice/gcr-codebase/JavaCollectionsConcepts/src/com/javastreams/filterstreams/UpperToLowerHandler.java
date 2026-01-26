package com.javastreams.filterstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

class UpperToLowerHandler
{
    void convertToLowerCase(String sourceFile, String destinationFile)
    {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try
        {
            br = new BufferedReader(new FileReader(sourceFile));
            bw = new BufferedWriter(new FileWriter(destinationFile));

            int data;
            while ((data = br.read()) != -1)  // read character by character
            {
                char ch = (char)data;
                bw.write(Character.toLowerCase(ch)); // convert to lowercase and write
            }

            System.out.println("Conversion to lowercase completed successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: Cannot read/write file.");
        }
        finally
        {
            try
            {
                if (br != null) br.close();
                if (bw != null) bw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing streams.");
            }
        }
    }
}
