
package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entites.User;

public interface UserRepository extends JpaRepository<User,Short> {

}
