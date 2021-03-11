package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entites.Cart_item;

public interface Cart_itemRepository extends JpaRepository<Cart_item,Short> {

}
