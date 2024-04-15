package com.comunidadevillalobos.internProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidadevillalobos.internProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
