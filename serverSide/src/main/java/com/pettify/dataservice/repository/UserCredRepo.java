package com.pettify.dataservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pettify.dataservice.model.UserCred;

@Repository
public interface UserCredRepo extends JpaRepository<UserCred, Integer> {
	
	Optional<UserCred> findByEmail(String Email);
	
	UserCred getAll();
}
