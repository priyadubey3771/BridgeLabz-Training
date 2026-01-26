package com.javastreams.readlargefilelinebyline;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class LargeFileReader
{
    void printErrorLines(String filePath)
    {
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null)
            {
                // Check if line contains "error" (case insensitive)
                if (line.toLowerCase().contains("error"))
                {
                    System.out.println(line);
                }
            }

            System.out.println("Finished reading file.");
        }
        catch (IOException e)
        {
            System.out.println("Error: Cannot read file.");
        }
        finally
        {
            try
            {
                if (br != null) br.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing file.");
            }
        }
    }
}
