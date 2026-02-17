package com.jdbc.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "Piyush@123#";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 