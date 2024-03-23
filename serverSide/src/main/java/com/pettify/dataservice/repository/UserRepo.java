package com.pettify.dataservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pettify.dataservice.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	Optional<User> findById(Integer id);
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findByNumber(String phonenumber);
	
	Boolean existsByPhoneNumber(String username);

    Boolean existsByEmail(String email);
    
    
}
