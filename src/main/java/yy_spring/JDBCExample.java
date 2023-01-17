package yy_spring;

import java.sql.*;

/**
 * Simple SQL Example.
 */
public class JDBCExample {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db", "user1", "pass")) {
			try (Statement stmt = con.createStatement()) {

				createTable(stmt);

				insertStudents(stmt);

				printStudents(stmt);

			}

		} catch (SQLException e) {
			throw new RuntimeException("SQL Error", e);
		}
	}

	private static void createTable(Statement stmt) throws SQLException {

		stmt.execute("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, grade DOUBLE)");

	}

	private static void insertStudents(Statement stmt) throws SQLException {

		stmt.execute("INSERT INTO students(name, grade) VALUES('Alice', 1.3)");
		stmt.execute("INSERT INTO students(name, grade) VALUES('Bob', 2.3)");
		stmt.execute("INSERT INTO students(name, grade) VALUES('Charlie', 1.7)");

	}

	private static void printStudents(Statement stmt) throws SQLException {

		ResultSet result = stmt.executeQuery("SELECT id, name, grade FROM students WHERE grade < 2.0");
		while (result.next()) {
			System.out.println(
					"Student:" + result.getString("name") + " Grade: " + result.getDouble("grade")
			);
		}
	}

}
