package com.matheus.f.n.pereira.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matheus.f.n.pereira.dsdeliver.dto.OrderDTO;
import com.matheus.f.n.pereira.dsdeliver.entities.Order;
import com.matheus.f.n.pereira.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(order -> new OrderDTO(order)).collect(Collectors.toList());
	}
}
