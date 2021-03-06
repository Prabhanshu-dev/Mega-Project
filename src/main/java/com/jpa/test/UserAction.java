package com.jpa.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;




@RestController
@RequestMapping("/user")
public class UserAction {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/")
	public void createUser(User user) {
		userRepository.save(user);
	}
	
	@GetMapping("/{id}")
	public User getSingleUser(@PathVariable int id) {
		return userRepository.findById(id).get();
	}
	
	@GetMapping("/")
	public List<User> readAll() {
		return (List<User>) userRepository.findAll();
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable int id,User user) {
		userRepository.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
	}
}
