package com.bean;

public class UserBean {
	static int userCounter = 1;
	int userId;
	String email, firstName, password;

	public UserBean() {
//		userId = (int)(Math.random() * 100000000);
		userId = userCounter;
		userCounter++;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
