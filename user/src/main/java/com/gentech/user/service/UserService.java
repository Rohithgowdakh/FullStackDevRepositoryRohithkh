package com.gentech.user.service;

import java.util.List;

import com.gentech.user.entity.User;

public interface UserService {
	
	User createUser(User user);
	
	List<User> getUsers();
	
	User getSpecificUser(Long id);
	
	User updateUser(User user,Long id);
	
	void deleteUser(Long id);
}
