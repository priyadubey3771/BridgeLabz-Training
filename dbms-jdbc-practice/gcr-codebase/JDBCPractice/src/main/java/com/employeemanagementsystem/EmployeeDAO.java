package com.employeemanagementsystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // Add Employee (Do NOT insert emp_id because it is AUTO_INCREMENT)
    public boolean addEmployee(Employee emp) {

        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, emp.getName());
            pstmt.setString(2, emp.getDepartment());
            pstmt.setDouble(3, emp.getSalary());

            int rows = pstmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            System.out.println("Error while adding employee: " + e.getMessage());
            return false;
        }
    }

    // View All Employees
    public List<Employee> getAllEmployees() {

        String sql = "SELECT * FROM employees";
        List<Employee> list = new ArrayList<>();

        try (Connection conn = ConnectionProvider.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                );
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // Update Salary (by emp_id)
    public boolean updateSalary(int empId, double newSalary) {

        String sql = "UPDATE employees SET salary = ? WHERE emp_id = ?";

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, newSalary);
            pstmt.setInt(2, empId);

            int rows = pstmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            System.out.println("Error while updating salary: " + e.getMessage());
            return false;
        }
    }

    // Delete Employee
    public boolean deleteEmployee(int empId) {

        String sql = "DELETE FROM employees WHERE emp_id = ?";

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, empId);

            int rows = pstmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            System.out.println("Error while deleting employee: " + e.getMessage());
            return false;
        }
    }

    // Search by Name
    public List<Employee> searchByName(String name) {

        String sql = "SELECT * FROM employees WHERE name LIKE ?";
        List<Employee> list = new ArrayList<>();

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + name + "%");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                );
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
