package com.matheus.f.n.pereira.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matheus.f.n.pereira.dsdeliver.dto.OrderDTO;
import com.matheus.f.n.pereira.dsdeliver.dto.ProductDTO;
import com.matheus.f.n.pereira.dsdeliver.entities.Order;
import com.matheus.f.n.pereira.dsdeliver.entities.Product;
import com.matheus.f.n.pereira.dsdeliver.entities.enums.OrderStatus;
import com.matheus.f.n.pereira.dsdeliver.repositories.OrderRepository;
import com.matheus.f.n.pereira.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(order -> new OrderDTO(order)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDTO insert(OrderDTO dto){
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(), OrderStatus.PENDING);
		for(ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		order = repository.save(order);
		
		return new OrderDTO(order);
	}
}
