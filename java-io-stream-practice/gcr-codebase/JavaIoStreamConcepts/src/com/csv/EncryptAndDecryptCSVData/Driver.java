package com.csv.EncryptAndDecryptCSVData;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Driver {
   public static void main(String[] args) throws Exception {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("secure_employees.csv"))) {

            bw.write("ID,Name,Email,Salary");
            bw.newLine();

            bw.write("201,Priya," + AESUtil.encrypt("priya@gmail.com") + "," + AESUtil.encrypt("45000"));
            bw.newLine();

            bw.write("202,Rahul," +AESUtil.encrypt("rahul@gmail.com") + "," + AESUtil.encrypt("60000"));
            bw.newLine();

            System.out.println("Encrypted CSV written successfully.");
        }
    }
}
