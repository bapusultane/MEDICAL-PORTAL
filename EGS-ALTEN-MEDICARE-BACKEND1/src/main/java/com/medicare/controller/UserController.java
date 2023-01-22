package com.medicare.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.medicare.model.User;
import com.medicare.service.UserService;


@RestController 
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user/")
public class UserController {


	@Autowired 
	UserService userService;

	//create checked 
	@PostMapping("/signup")
	public ResponseEntity<User> signUp(@RequestBody User user){
		String emailId = user.getEmailid();
		if(emailId != null && !"".equals(emailId)) {
			User userobj = userService.fetchUserByEmailId(emailId);
			if(userobj != null) {
				return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
			}
		}
		return (userService.register(user));	
	}


	@PostMapping("/login")
	public User login(@RequestBody User user) {
		String emailId = user.getEmailid();
		String password = user.getPassword();
		String role = user.getRole();
		User userObj = null;


		if(emailId != null && password != null && role != null) {
			if(role.equals("user")) {
				userObj = userService.fetchUsersByEmailAndPasswordAndRole(emailId, password, role);
			}
		}
		return userObj;
	}

	@RequestMapping(value="/userbyname/{username}",method=RequestMethod.GET)
	public User getUserByName(@PathVariable String username) {

		System.out.println("userService.getClass() : "+ userService.getClass());

		User user = userService.getUserByName(username);
		return user;
		//checked 

	}

	@RequestMapping( value="/userlist",method=RequestMethod.GET)
	public List<User> list() {
		return userService.list();
		//checked
	}
	@RequestMapping(value="/userbymobilenumber/{mobilenumber}",method=RequestMethod.GET)
	public User getUserByMobileNumber(@PathVariable String mobilenumber) {


		System.out.println("userService.getClass() : "+ userService.getClass());

		User user = userService.getUserByMobileNumber(mobilenumber);
		return user;
		//checked 


	}

	// delete user 
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable long id) {
		User user = userService.getUserById(id);

		userService.delete(user);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
		//checked 
	}
	@RequestMapping(value="/updateuserbyemail/{emailId}",method=RequestMethod.GET)
	public User getupdateuserbyemail(@PathVariable String emailid) {

		System.out.println("userService.getClass() : "+ userService.getClass());
		User user = userService.getUserByName(emailid);
		return user;

	}

	@RequestMapping(value="/updateuser",method=RequestMethod.PUT)
	public void updateuser(@RequestBody User user) {

		System.out.println("userService.getId(): "+ user.getUserid());

		userService.updateUser(user);
		//checked 
	}


}