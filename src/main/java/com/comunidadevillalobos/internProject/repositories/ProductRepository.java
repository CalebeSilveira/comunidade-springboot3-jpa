package com.comunidadevillalobos.internProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidadevillalobos.internProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
