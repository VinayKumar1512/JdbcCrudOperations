package doa;
import java.sql.*;  

public class ConnectionTest {
	
	public static Connection getConnection() throws Exception {
		
		    Connection con=null;
		       try {
		       //registering driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// variables
			      final String url = "jdbc:mysql://localhost:3306/userdb";
			      final String user = "root";
			      final String password = "root";
			      
			      // connection establishment
			      con = DriverManager.getConnection(url, user, password);

			      }
			      catch(SQLException e) {
			    	  e.printStackTrace();
			      }

               
		       if(con==null) {
		    	   return null;
		       }
		       else {
		    	   return con;
		       }
			      
	}

}
