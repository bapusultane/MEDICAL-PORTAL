package com.medicare.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.medicare.model.User;



public interface UserService {
	
	User getUserByName(String name );
	
	void updateUser(User user);// update user name 
	
	List<User> list();
	
	User getUserDetailsByUsernameAndPassword(String username,String password); //usermade method
	
	User getUserByMobileNumber(String mobilenumber);

	User save(User user);
	
	User getUserById(long id );

	void delete(User user);
	
	User existsByUsername (String name);
	
	User getUserByRole(String role);

	User signUp(User user);
	
	 User saveUser(User user);
		
	 User fetchUserByEmailId(String emailid);
	 
	 
	
	 User fetchUsersByEmailAndPasswordAndRole(String emailid, String password, String role);

	ResponseEntity<User> register(User user);

}

