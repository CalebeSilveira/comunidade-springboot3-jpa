package com.comunidadevillalobos.internProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidadevillalobos.internProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
