package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entites.Product;


public interface ProductRepository extends JpaRepository<Product,Integer>{

}
