package com.javastreams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileHandler
{
    void copyFile(String sourceFile, String destinationFile)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try
        {
            fis = new FileInputStream(sourceFile);  // Open source file
            fos = new FileOutputStream(destinationFile);  // Open destination file (created if does not exist)

            int data;
            while ((data = fis.read()) != -1)  // Read byte by byte
            {
                fos.write(data);  // Write byte to destination file
            }

            System.out.println("File copied successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: Source file does not exist or cannot be read.");
        }
        finally
        {
            try
            {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing streams.");
            }
        }
    }

    void displayFile(String fileName)
    {
        FileInputStream fis = null;

        try
        {
            fis = new FileInputStream(fileName);  // Open file for reading

            int data;
            while ((data = fis.read()) != -1)  // Read byte by byte
            {
                System.out.print((char)data);  // Display content
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: File does not exist or cannot be read.");
        }
        finally
        {
            try
            {
                if (fis != null)
                    fis.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing the stream.");
            }
        }
    }
}
