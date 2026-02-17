package com.advancedfeatures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static final String URL = "jdbc:mysql://localhost:3306/library_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Piyush@123#";

    public static Connection getConnection() {
        try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
	        throw new RuntimeException("Database connection failed: " + e.getMessage(), e);
	    }
	}
}