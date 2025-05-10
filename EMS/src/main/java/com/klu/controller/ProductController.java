package com.klu.controller;

import java.util.*;

import com.klu.service.ProductManager;
import com.klu.model.Product;


import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductManager PM;
	
	
	// Creating HTTP request to call "createProduct" method
	@PostMapping("/createProduct")
	public String createProduct(@RequestBody Product p) {
		PM.createProduct(p);
		
		return "Product created successfully";
	}
	
	
	// HTTP request to view product
	@GetMapping("/viewProduct/{id}")
	public Optional<Product> ViewProduct(@PathVariable int id) {
		return PM.viewProduct(id);
	}
	
	
	//HTTP request to update product
	@PutMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody Product p){
		p.setPid(id);
		PM.updateProduct(p);
		return "Product updated successfully";
	}
	
	
	//HTTP request to view ALL Products
	@GetMapping("/viewAllProducts")
	public List<Product> viewAllProducts() {
	    return PM.viewAllProducts();
	}
	  
	// HTTP request for delete a product by id
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
	    PM.deleteProduct(id);
	    return "product deleted success";   
	}

}
