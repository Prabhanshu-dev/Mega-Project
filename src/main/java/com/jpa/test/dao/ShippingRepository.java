package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entites.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping,Short> {

}
