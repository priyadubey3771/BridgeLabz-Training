package com.exceptionhandling.checkedexception;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileReaderHandler
{
    void readFile(String filePath)
    {
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("File not found");
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
