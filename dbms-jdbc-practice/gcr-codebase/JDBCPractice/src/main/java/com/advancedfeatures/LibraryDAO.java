package com.advancedfeatures;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {

	// Borrow Book (Transaction)
	public boolean borrowBook(int studentId, int bookId) {

		// Corrected insert and removed due_date (matches your table)
		String checkBookSQL = "SELECT available_copies FROM books WHERE book_id=?";
		String checkStudentSQL = "SELECT student_id FROM students WHERE student_id=?";
		String insertSQL = "INSERT INTO borrow_records (student_id, book_id, borrow_date) VALUES (?, ?, CURDATE())";
		String updateSQL = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id=?";

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			// ✅ Check student exists
			try (PreparedStatement ps = conn.prepareStatement(checkStudentSQL)) {
				ps.setInt(1, studentId);
				ResultSet rs = ps.executeQuery();
				if (!rs.next()) {
					conn.rollback();
					System.out.println("Invalid Student ID!");
					return false;
				}
			}

			// Check book availability
			try (PreparedStatement ps = conn.prepareStatement(checkBookSQL)) {
				ps.setInt(1, bookId);
				ResultSet rs = ps.executeQuery();
				if (!rs.next() || rs.getInt("available_copies") <= 0) {
					conn.rollback();
					System.out.println("Book Not Available!");
					return false;
				}
			}

			// Insert borrow record
			try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
				ps.setInt(1, studentId);
				ps.setInt(2, bookId);
				ps.executeUpdate();
			}

			// Update inventory
			try (PreparedStatement ps = conn.prepareStatement(updateSQL)) {
				ps.setInt(1, bookId);
				ps.executeUpdate();
			}

			conn.commit();
			return true;

		} catch (Exception e) {
			try {
				if (conn != null)
					conn.rollback();
			} catch (Exception ex) {
			}
			e.printStackTrace(); // Important: see real error
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}

	// 🔥 Return Book + Fine Calculation
	public boolean returnBook(int recordId) {

		String selectSQL = "SELECT borrow_date, book_id FROM borrow_records WHERE record_id=?";
		String updateBorrow = "UPDATE borrow_records SET return_date=CURDATE(), fine=? WHERE record_id=?";
		String updateBook = "UPDATE books SET available_copies=available_copies+1 WHERE book_id=?";

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			Date borrowDate;
			int bookId;

			try (PreparedStatement ps = conn.prepareStatement(selectSQL)) {
				ps.setInt(1, recordId);
				ResultSet rs = ps.executeQuery();
				if (!rs.next())
					return false;
				borrowDate = rs.getDate("borrow_date");
				bookId = rs.getInt("book_id");
			}

			long diff = (System.currentTimeMillis() - borrowDate.getTime()) / (1000 * 60 * 60 * 24);
			double fine = diff > 7 ? (diff - 7) * 10 : 0;

			try (PreparedStatement ps = conn.prepareStatement(updateBorrow)) {
				ps.setDouble(1, fine);
				ps.setInt(2, recordId);
				ps.executeUpdate();
			}

			try (PreparedStatement ps = conn.prepareStatement(updateBook)) {
				ps.setInt(1, bookId);
				ps.executeUpdate();
			}

			conn.commit();
			return true;

		} catch (Exception e) {
			try {
				if (conn != null)
					conn.rollback();
			} catch (Exception ex) {
			}
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}

	// 🔎 Multi-filter Search
	public List<Book> searchBooks(String title, String author, String category) {

		StringBuilder sql = new StringBuilder("SELECT * FROM books WHERE 1=1");
		List<Object> params = new ArrayList<>();

		if (title != null && !title.isEmpty()) {
			sql.append(" AND title LIKE ?");
			params.add("%" + title + "%");
		}

		if (author != null && !author.isEmpty()) {
			sql.append(" AND author LIKE ?");
			params.add("%" + author + "%");
		}

		if (category != null && !category.isEmpty()) {
			sql.append(" AND category LIKE ?");
			params.add("%" + category + "%");
		}

		List<Book> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql.toString())) {

			for (int i = 0; i < params.size(); i++) {
				ps.setObject(i + 1, params.get(i));
			}

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// Removed total_copies (your table does not have it)
				list.add(new Book(rs.getInt("book_id"), rs.getString("title"),rs.getString("author"),rs.getString("category"),rs.getInt("total_copies"),
					    rs.getInt("available_copies")
					));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
