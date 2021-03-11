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

import com.jpa.test.dao.CategoryRepository;
import com.jpa.test.entites.Category;


@RestController
@RequestMapping("/category")
public class MCategoryAction {
	
	
	@Autowired
	CategoryRepository CategoryRepository;
	
	@PostMapping("/")
	public void createUser(Category category) {
		CategoryRepository.save(category);
	}
	
	@GetMapping("/{id}")
	public Category getSingleUser(@PathVariable short id) {
		return CategoryRepository.findById(id).get();
	}
	
	@GetMapping("/")
	public List<Category> readAll() {
		return (List<Category>) CategoryRepository.findAll();
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable short id,Category category) {
		CategoryRepository.save(category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable short id) {
		CategoryRepository.deleteById(id);
	}

}
