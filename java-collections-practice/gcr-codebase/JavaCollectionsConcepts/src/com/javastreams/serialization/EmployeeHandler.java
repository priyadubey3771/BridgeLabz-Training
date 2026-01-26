package com.javastreams.serialization;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;

class EmployeeHandler
{
    void saveEmployees(String fileName, ArrayList<Employee> employees)
    {
        ObjectOutputStream oos = null;

        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(employees); // serialize the list
            System.out.println("Employees saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to save employees.");
        }
        finally
        {
            try
            {
                if (oos != null) oos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing stream.");
            }
        }
    }

    void loadEmployees(String fileName)
    {
        ObjectInputStream ois = null;

        try
        {
            ois = new ObjectInputStream(new FileInputStream(fileName));
            ArrayList<Employee> employees = (ArrayList<Employee>) ois.readObject(); // deserialize

            System.out.println("Employees loaded from file:");
            for (Employee emp : employees)
            {
                emp.display();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to read employees.");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error: Class not found.");
        }
        finally
        {
            try
            {
                if (ois != null) ois.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing stream.");
            }
        }
    }
}
