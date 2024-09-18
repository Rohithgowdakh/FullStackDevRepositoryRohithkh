package com.gentech.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.user.entity.User;
import com.gentech.user.service.UserService;

@RestController
@RequestMapping("/v1/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		return new ResponseEntity<User>(userService.createUser(user),HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUsers()
	{
		return new ResponseEntity<List<User>>(userService.getUsers(),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getSpecificUser(@PathVariable Long id)
	{
		return new ResponseEntity<User>(userService.getSpecificUser(id),HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable Long id)
	{
		return new ResponseEntity<User>(userService.updateUser(user, id),HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id)
	{
		userService.deleteUser(id);
		return new ResponseEntity<String>("The user id : "+id+" is deleted",HttpStatusCode.valueOf(200));
	}
}
