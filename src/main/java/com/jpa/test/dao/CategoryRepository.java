package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entites.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
