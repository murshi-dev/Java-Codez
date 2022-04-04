import java.sql.*;

public class JDBCCRUDUsersInsert {

	public static void mainIns(String[] args) {
		// set the dbconnection with username and password
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password))
		// getConnection from the DriverManager class helps to connect
		// with the mysql server, with the required db, username and password
		{
			// insert one record to the users table
			String sql = "INSERT INTO users(username,password,fullname,email)VALUES(?,?,?,?)";
			// pass this sql to PreparedStatement class
			PreparedStatement statement = conn.prepareStatement(sql);
			// now pass values for each column using setString method
			statement.setString(1, "amy");// first param--column index, second param--data
			statement.setString(2, "123");
			statement.setString(3, "Amy Doe");
			statement.setString(4, "amy@gmail.com");
			// execute the queries-executeUpdate() method
			int rowsinserted = 0;
			rowsinserted = statement.executeUpdate();
			if (rowsinserted > 0) {
				System.out.println("new data added");
				// to display confirmation in console
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
