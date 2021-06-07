package com.projetospringbootjpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
