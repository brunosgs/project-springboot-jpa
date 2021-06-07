package com.projetospringbootjpa.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringbootjpa.curso.entities.Order;
import com.projetospringbootjpa.curso.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> objectOrder = orderRepository.findById(id);

		return objectOrder.get();
	}
}
