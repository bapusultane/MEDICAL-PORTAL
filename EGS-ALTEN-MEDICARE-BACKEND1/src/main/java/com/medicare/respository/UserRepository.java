package com.medicare.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medicare.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT * FROM Users WHERE username=:username", nativeQuery = true)
	public User getUserByName(@Param("username") String username);	
	
	@Query(value = "SELECT * FROM User WHERE name=:name AND password=:password ", nativeQuery = true)
	public User getUserDetailsByUsernameAndPassword(@Param("name") String username,@Param("password") String password);	

	@Query(value = "SELECT * FROM User WHERE mobilenumber=:mobilenumber", nativeQuery = true)
	public User getUserByMobileNumber(@Param("mobilenumber") String mobilenumber);

	@Query(value = "SELECT * FROM User WHERE name=:name", nativeQuery = true)
	public User existsByUsername(@Param("name") String name);

	@Query(value = "SELECT * FROM User WHERE role=:role", nativeQuery = true)
	public User getUserByRole(String role);
	
	@Query(value = "SELECT * FROM Users WHERE emailid=:emailid", nativeQuery = true)
	public User findbyEmailId(@Param("emailid") String emailid);

	@Query(value="SELECT * FROM Users WHERE emailid=:emailid AND password=:password AND role=:role",nativeQuery=true)
	public User findByEmailIdAndPasswordAndRole(@Param("emailid") String emailid, @Param("password") String password, @Param("role") String role );
	//    public User fetchUserByEmailId( @Param("emailid") String emailid ,@Param( "role") String role , @Param( "password") String password)
}

	
		
	
	
	
