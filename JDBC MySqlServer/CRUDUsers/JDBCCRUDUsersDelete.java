import java.sql.*;
//program to delete records in users table 
public class JDBCCRUDUsersDelete {

	public static void main(String[] args) {
		//connect to database
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password))
		{
			//write queries
			String sql="DELETE FROM users WHERE username=?";
			
			PreparedStatement statement=conn.prepareStatement(sql);
			statement.setString(1, "amy");
		
			//execute queries
			int rowsdeleted=statement.executeUpdate();
			if(rowsdeleted>0)
			{
				System.out.println("data deleted");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
