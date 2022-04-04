import java.sql.*;

public class InsertBook { // Save as "JdbcUpdateTest.java"
	public static void mainins(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/ebookshop";
		String username = "root";
		String password = "root";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sqlInsert = "insert into books values (001, 'Gone Fishing', 'Anu', 11.11, 11)";

			PreparedStatement stmt = conn.prepareStatement(sqlInsert);

			int countInserted = stmt.executeUpdate(sqlInsert);
			if (countInserted > 0) {
				System.out.println("row inserted");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}