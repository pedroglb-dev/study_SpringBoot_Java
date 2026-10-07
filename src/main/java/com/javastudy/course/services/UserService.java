package com.javastudy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastudy.course.entities.User;
import com.javastudy.course.repositories.UserRepository;

@Service
public class UserService {

	
	private final UserRepository repository;
	UserService(UserRepository userRepository){
		repository = userRepository;
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}
}
