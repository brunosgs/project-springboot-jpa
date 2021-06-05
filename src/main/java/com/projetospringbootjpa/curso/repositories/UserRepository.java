package com.projetospringbootjpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
