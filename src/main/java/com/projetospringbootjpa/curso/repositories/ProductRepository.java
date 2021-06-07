package com.projetospringbootjpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
