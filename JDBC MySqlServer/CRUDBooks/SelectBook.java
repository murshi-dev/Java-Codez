import java.sql.*;

public class SelectBook { 
	public static void mainsel(String[] args) {

		String dbURL = "jdbc:mysql://localhost:3306/ebookshop";
		String username = "root";
		String password = "root";
	
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			
	
			String strSelect = "select title, price, qty from books";
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(strSelect);
		
			System.out.println("The records selected are:");
			int rowCount = 0;
	
			while (rset.next()) { // Repeatedly process each row
				String title = rset.getString("title"); // retrieve a 'String'-cell in the row
				double price = rset.getDouble("price"); // retrieve a 'double'-cell in the row
				int qty = rset.getInt("qty"); // retrieve a 'int'-cell in the row
				System.out.println(title + ", " + price + ", " + qty);
				++rowCount;
			}
			System.out.println("Total number of records = " + rowCount);

		} catch (SQLException ex) {
			ex.printStackTrace();
		} 
	}
}