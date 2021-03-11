package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entites.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Short> {

}
