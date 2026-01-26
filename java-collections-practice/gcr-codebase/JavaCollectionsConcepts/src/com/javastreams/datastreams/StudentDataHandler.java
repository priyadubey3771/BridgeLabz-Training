package com.javastreams.datastreams;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

class StudentDataHandler
{
    void saveStudentData(String fileName, int rollNo, String name, double gpa)
    {
        DataOutputStream dos = null;

        try
        {
            // overwrite mode, do NOT append
            dos = new DataOutputStream(new FileOutputStream(fileName));

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to write data.");
        }
        finally
        {
            try
            {
                if (dos != null) dos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing stream.");
            }
        }
    }

    void loadStudentData(String fileName)
    {
        DataInputStream dis = null;

        try
        {
            dis = new DataInputStream(new FileInputStream(fileName));

            System.out.println("Student Details from file:");

            while (dis.available() > 0)
            {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll No: " + rollNo);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println("--------------------------");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to read data.");
        }
        finally
        {
            try
            {
                if (dis != null) dis.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing stream.");
            }
        }
    }
}
