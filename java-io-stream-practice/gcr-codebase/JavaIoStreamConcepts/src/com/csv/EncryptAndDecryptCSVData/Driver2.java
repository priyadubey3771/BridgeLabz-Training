package com.csv.EncryptAndDecryptCSVData;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver2 {
   public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("secure_employees.csv"))) 
        {
        	String line = br.readLine(); // header

            while ((line = br.readLine()) != null) 
            {

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = AESUtil.decrypt(data[2]);
                String salary = AESUtil.decrypt(data[3]);

                System.out.println("ID: " + id +", Name: " + name + ", Email: " + email + ", Salary: " + salary);
            }
        }
    }
}
