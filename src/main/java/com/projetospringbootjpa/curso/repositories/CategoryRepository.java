package com.projetospringbootjpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
