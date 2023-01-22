package com.medicare.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.medicare.model.User;
import com.medicare.respository.UserRepository;
import com.medicare.service.UserService;

@Service
public class UserServiceImpl  implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserByName(String username) {
		return userRepository.getUserByName(username);

		
	}

	@Override
	public List<User> list() {

		return userRepository.findAll();
	}

	@Override
	public User getUserDetailsByUsernameAndPassword(String username, String password) {

		return userRepository.getUserDetailsByUsernameAndPassword(username, password);
	}

	@Override
	public User getUserByMobileNumber(String mobilenumber) {

		return userRepository.getUserByMobileNumber(mobilenumber);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findById(id).orElse(new User());
	}

	@Override 
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public User existsByUsername(String name) {

		return userRepository.existsByUsername(name);
	}

	@Override
	public User getUserByRole(String role) {

		return userRepository.getUserByRole(role);
	}

	@Override
	public User signUp(User user) {
		
		return userRepository.save(user);
	}
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User fetchUserByEmailId(String emailid) {
		return userRepository.findbyEmailId(emailid);
	}

	@Override
	public User fetchUsersByEmailAndPasswordAndRole(String emailid, String password, String role) {
		return userRepository.findByEmailIdAndPasswordAndRole(emailid, password, role);
	}

	@Override
	public ResponseEntity<User> register(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}


}
