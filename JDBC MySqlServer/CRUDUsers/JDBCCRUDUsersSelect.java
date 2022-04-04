import java.sql.*;
//program to display records from sql server 'users' table
//and display in the console here
public class JDBCCRUDUsersSelect {

	public static void mainSel(String[] args) {
		//connect to database
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password))
		{
		//write queries
			String sql="SELECT * FROM users";
			
			Statement statement=conn.createStatement();
			//get all the records and put in ResultSet
			//so that records can be dislayed row by row 
			ResultSet result=statement.executeQuery(sql);
			//use loop to display row by row
			while(result.next()) {
				String uname=result.getString(2);//gets username
				String pass=result.getString(3);//gets password
				String fullname=result.getString("fullname");//gets fullname
				String email=result.getString("email");//gets email
				//Note! data can be obtained through getString() method
				//either use column index(1,2,3) or column name(fullname,email)
				System.out.println("Username: "+uname+"Password: "+pass+"Fullname: "+fullname+"Email: "+email);
			}
		//display in console
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

}
}
