package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entites.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer>{

}
