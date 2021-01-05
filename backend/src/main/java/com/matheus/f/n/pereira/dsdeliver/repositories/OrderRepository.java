package com.matheus.f.n.pereira.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.f.n.pereira.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
