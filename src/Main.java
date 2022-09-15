import java.util.*;
import doa.DBOperations;
import models.User;

public class Main {
	
	public static void main(String args[]) throws Exception {
		
//		User user= new User(8,"vinay","vkvinay","VinayKumar","vkvinay217@gmail.com");
		DBOperations db =new DBOperations();
//		db.insert(user);
		db.update(6,"VinayK","vkvinay217","VinayKumar","vkvinay217@gmail.com");
//		db.delete(8);
//		User user= db.retreive(3);
//		System.out.println(user.userId);
//		System.out.println(user.userName);
//		System.out.println(user.password);
//		System.out.println(user.fullName);
//		System.out.println(user.email);
		
//		List<User> list= db.getAll();		
//	    
//		for(User user: list) {
//			System.out.println(user.fullName);
//		}
	}

}
