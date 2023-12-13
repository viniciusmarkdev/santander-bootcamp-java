package me.dio.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.model.User;
import me.dio.repository.UserRepository;
import me.dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository userRepository;
	
	
	public UserServiceImpl (UserRepository userRepository) {
		
		
		this.userRepository = userRepository;
			
	}
	
	public List<User> getAll(){
		
		return userRepository.findAll();
		
	}

	@Override
	public User findById(Long id) {
	
	    return  userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	    
	}
    
	@Override
	public User create(User userToCreate) {
		
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			
			throw new IllegalArgumentException("This Account number ID already exists.");
			
		}
		

		return userRepository.save(userToCreate);
	}
	
	

}
