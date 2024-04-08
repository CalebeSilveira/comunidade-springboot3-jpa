package com.comunidadevillalobos.internProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidadevillalobos.internProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
