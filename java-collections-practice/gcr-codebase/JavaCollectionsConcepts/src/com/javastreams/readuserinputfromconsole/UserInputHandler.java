package com.javastreams.readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

class UserInputHandler
{
    void readAndSaveUserData(String fileName)
    {
        BufferedReader br = null;
        FileWriter fw = null;

        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            fw = new FileWriter(fileName, true); // append mode

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");
            fw.write("-----------\n");

            System.out.println("User data saved to " + fileName);
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to read input or write to file.");
        }
        finally
        {
            try
            {
                if (br != null) br.close();
                if (fw != null) fw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing streams.");
            }
        }
    }
}
