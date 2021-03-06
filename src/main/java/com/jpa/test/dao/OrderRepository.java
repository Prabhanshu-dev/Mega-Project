package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jpa.test.entites.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{

}
