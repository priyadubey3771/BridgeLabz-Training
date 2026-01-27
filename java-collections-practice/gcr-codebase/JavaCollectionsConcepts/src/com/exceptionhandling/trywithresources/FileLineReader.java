package com.exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileLineReader
{
    void readFirstLine(String filePath)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line = br.readLine();

            if (line != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file");
        }
    }
}
