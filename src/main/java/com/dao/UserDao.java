package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	ArrayList<UserBean> users = new ArrayList<UserBean>();

	public UserDao() {
		UserBean user1 = new UserBean();
		user1.setEmail("ram@gmail.com");
		user1.setFirstName("ram");
		user1.setPassword("ram123");
		users.add(user1);

		UserBean user2 = new UserBean();
		user2.setEmail("sita@gmail.com");
		user2.setFirstName("sita");
		user2.setPassword("sita123");
		users.add(user2);

	}

	public void insertUser(UserBean user) {
		// insertQuery

		users.add(user);
	}

	public ArrayList<UserBean> getAllUsers() {
		return users;
	}

	public void deleteUser(int userId) {
 		
	}
}

//singleton ready 
//new 
