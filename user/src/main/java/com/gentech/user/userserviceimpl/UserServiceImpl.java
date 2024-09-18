package com.gentech.user.userserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.user.entity.User;
import com.gentech.user.exception.ResourceNotFoundException;
import com.gentech.user.repository.UserRepository;
import com.gentech.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User getSpecificUser(Long id) {
		
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user", "username", id));
	}

	@Override
	public User updateUser(User user,Long id) {
	
		User existingUser= userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user", "username", id));
		
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		existingUser.setName(user.getName());
		
		return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user", "username", id));
		
		userRepository.deleteById(id);
		
	}

}
