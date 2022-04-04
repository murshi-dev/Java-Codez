import java.sql.*;
//program to update records in users table 
public class JDBCCRUDUsersUpdate {

	public static void mainUpd(String[] args) {
		//connect to database
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password))
		{
			//write queries
			String sql="UPDATE users SET password=?,fullname=?,email=? WHERE username=?";
			
			PreparedStatement statement=conn.prepareStatement(sql);
			//using the setString method change the values
			statement.setString(1, "456");
			statement.setString(2, "John Doe");
			statement.setString(3, "john@outlook.com");
			statement.setString(4, "amy");//based on this username, 
			//param 1,2,3 values will be updated
			
			//execute queries
			int rowsupdated=statement.executeUpdate();
			if(rowsupdated>0)
			{
				System.out.println("data updated");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
