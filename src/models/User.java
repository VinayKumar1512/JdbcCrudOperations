package models;

public class User {

		public int userId;
		public String userName;
		public String password;
		public String fullName;
		public String email;
		
		
	 public int getUserId() {
			return userId;
		}


		public void setUserId(int userId) {
			this.userId = userId;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getFullName() {
			return fullName;
		}


		public void setFullName(String fullName) {
			this.fullName = fullName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


	public	User(int userId,String userName,String password,String fullName,String email){
			this.userId= userId;
			this.userName= userName;
			this.password=password;
			this.fullName=fullName;
			this.email= email;
		}
		
}
