package doa;
import java.util.*;

import java.sql.*;

import models.User;

public class DBOperations {

	public void insert(User user) throws Exception{
		
		Connection con= ConnectionTest.getConnection();
		
		int userid= user.userId;
		String username= user.userName;
		String password= user.password;
		String fullname= user.fullName;
		String email= user.email;
		
		String insertData= "INSERT INTO users (user_id,username, password, fullname, email) VALUES (?, ?, ?, ?,?)";
		PreparedStatement stmt = con.prepareStatement(insertData);
		
		stmt.setInt(1, user.userId);
		stmt.setString(2, username);
		stmt.setString(3, password);
		stmt.setString(4, fullname);
		stmt.setString(5, email);
		stmt.executeUpdate();
		
//		con.close();
		
	}
	
	public void update(int userId,String username,String password,String fullName,String email) throws Exception{
	
		Connection con= ConnectionTest.getConnection();
		
		String updateData= "UPDATE users SET username=?, password=?, fullname=?, email=? WHERE user_id=?";
		PreparedStatement stmt = con.prepareStatement(updateData);
		
		stmt.setString(1, username);
		stmt.setString(2, password);
		stmt.setString(3, fullName);
		stmt.setString(4, email);
		stmt.setInt(5, userId);
		stmt.executeUpdate();
		
//		con.close();	
		
	}
	
	public User retreive(int user_id) throws Exception{
	
		Connection con= ConnectionTest.getConnection();
		String retreiveData = "SELECT * FROM users WHERE user_id = ?";
		 
		PreparedStatement stmt = con.prepareStatement(retreiveData);
		stmt.setInt(1,user_id);
		
		ResultSet result = stmt.executeQuery();
		if(result==null) {
			return null;
		}
		String name="";
		String pass="";
		String fullname="";
		String email="";
		
		while (result.next()) {   
			//User user = new User(result.getString("username"), name, pass, fullname, email)
			name = result.getString("username");
		    pass = result.getString("password");
		    fullname = result.getString("fullname");
		    email = result.getString("email");
			}
		
		return new User(user_id,name,pass,fullname,email);
	}
	
	
	public void delete(int user_id) throws Exception{
	
		Connection con= ConnectionTest.getConnection();
		
		String deleteData = "DELETE FROM users WHERE user_id=?";
		 
		PreparedStatement stmt= con.prepareStatement(deleteData);
		stmt.setInt(1, user_id);
		stmt.executeUpdate();
//		con.close();
		
	}
	
	public List<User> getAll() throws Exception{
	
		Connection con= ConnectionTest.getConnection();
		
		String getData = "SELECT * FROM users";
		 
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(getData);
		
		ArrayList<User> ans= new ArrayList<>();
		List<User> ans= new ArrayList<>();
		
		while (result.next()){
			int userId = result.getInt("user_id");
		    String name = result.getString("username");
		    String pass = result.getString("password");
		    String fullname = result.getString("fullname");
		    String email = result.getString("email");
		 
		    ans.add(new User(userId,name,pass,fullname,email));
		    
		}
		
		return ans;
	}


}
