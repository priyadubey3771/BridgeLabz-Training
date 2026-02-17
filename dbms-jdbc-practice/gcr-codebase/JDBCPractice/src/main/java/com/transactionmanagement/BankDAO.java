package com.transactionmanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDAO {

    // Transfer Money (Transaction)
    public boolean transferMoney(int fromAcc, int toAcc, double amount) {

        // ✅ Correct table and column names
        String deductSQL = "UPDATE accounts SET balance = balance - ? WHERE acc_no = ?";
        String addSQL = "UPDATE accounts SET balance = balance + ? WHERE acc_no = ?";
        String insertTxn = "INSERT INTO transactions (from_account, to_account, amount, transaction_date) VALUES (?, ?, ?, NOW())";

        Connection conn = null;

        try {
            conn = ConnectionProvider.getConnection();
            conn.setAutoCommit(false); // START TRANSACTION

            // Check balance first
            if (getBalanceInternal(conn, fromAcc) < amount) {
                System.out.println("Insufficient Balance!");
                conn.rollback();
                return false;
            }

            // Deduct from sender
            try (PreparedStatement ps1 = conn.prepareStatement(deductSQL)) {
                ps1.setDouble(1, amount);
                ps1.setInt(2, fromAcc);
                ps1.executeUpdate();
            }

            // Add to receiver
            try (PreparedStatement ps2 = conn.prepareStatement(addSQL)) {
                ps2.setDouble(1, amount);
                ps2.setInt(2, toAcc);
                ps2.executeUpdate();
            }

            // Insert Transaction Record
            try (PreparedStatement ps3 = conn.prepareStatement(insertTxn)) {
                ps3.setInt(1, fromAcc);
                ps3.setInt(2, toAcc);
                ps3.setDouble(3, amount);
                ps3.executeUpdate();
            }

            conn.commit(); // SUCCESS
            return true;

        } catch (Exception e) {
            try {
                if (conn != null) conn.rollback(); // FAILURE
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Check Balance
    public double getBalance(int accNo) {

        String sql = "SELECT balance FROM accounts WHERE acc_no = ?";

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDouble("balance");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    // Internal balance check (used inside transaction)
    private double getBalanceInternal(Connection conn, int accNo) throws SQLException {

        String sql = "SELECT balance FROM accounts WHERE acc_no = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, accNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("balance");
            }
        }
        return 0;
    }

    // Transaction History
    public List<Transaction> getTransactionHistory(int accNo) {

        String sql = "SELECT * FROM transactions WHERE from_account = ? OR to_account = ?";
        List<Transaction> list = new ArrayList<>();

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accNo);
            ps.setInt(2, accNo);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Transaction(
                        rs.getInt("transaction_id"),
                        rs.getInt("from_account"),
                        rs.getInt("to_account"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("transaction_date")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
