package me.dio.service;

import java.util.List;

import me.dio.model.User;



public interface UserService {
	
	User findById(Long id);
	
	
	User create(User userToCreate);
	
	
	List<User> getAll();
	

}
