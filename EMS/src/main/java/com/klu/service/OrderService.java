package com.klu.service;

import com.klu.repository.OrderRepo;
import com.klu.model.Order;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo OR;
	
	
	// add order
	public Order addOrder(Order o) {
		return OR.save(o);
	}
	
	
	// update order
	public Order updateOrder(Order o) {
		return OR.save(o);
	}

}
