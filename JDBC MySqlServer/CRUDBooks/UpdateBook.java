import java.sql.*;
 
public class UpdateBook {    // Save as "JdbcUpdateTest.java"
   public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost:3306/ebookshop";
		String username = "root";
		String password = "root";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
	      String strUpdate = "update books set price = price*1.07, qty = qty+1 where id = 1001";
          PreparedStatement stmt = conn.prepareStatement(strUpdate);
          int countUpdated = stmt.executeUpdate();
  
     	if (countUpdated > 0) {
			System.out.println(" a row is updated");
		}
         // Step 3 & 4 (again): Issue a SELECT (via executeQuery()) to check the UPDATE.
         String strSelect = "select * from books where id = 1001";

         ResultSet rset = stmt.executeQuery(strSelect);
         while(rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getInt("id") + ", "
                    + rset.getString("author") + ", "
                    + rset.getString("title") + ", "
                    + rset.getDouble("price") + ", "
                    + rset.getInt("qty"));
         }
      } catch(SQLException ex) {
         ex.printStackTrace();
      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources
   }
}