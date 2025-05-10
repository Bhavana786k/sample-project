package com.klu.controller;

import com.klu.model.Order;
import com.klu.service.OrderService;

import org.springframework.web.bind.annotation.*;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.*;


@RestController
@RequestMapping("/api/order")
public class OrderController {
	@Autowired
	private OrderService os;
	
	
	// HTTP request for adding order
	@PostMapping("/addOrder")
	public String addOrder(@RequestBody Order o) {
		os.addOrder(o);		
		return "Order added successfully";
	}
	
	
	// HTTP request for updating order
	@PutMapping("/updateOrder/{id}")
	public String updateOrder(@PathVariable int id, @RequestBody Order o) {
		o.setOid(id);
		os.updateOrder(o);
		return "Order updated successfully";
	}
	

}
