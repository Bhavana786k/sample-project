package com.klu.service;

import java.util.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.*;

import com.klu.repository.ProductRepo;
import com.klu.model.Product;

@Service
public class ProductManager {
	@Autowired
	private ProductRepo PR;
	
	
	// Create a product
	public Product createProduct(Product p) {
		return PR.save(p);
	}
	
	// View product
	public Optional<Product> viewProduct(int id) {
		return PR.findById(id);
	}
	
	// Update product
	public Product updateProduct(Product p) {
		return PR.save(p);		
	}
	
	// View all products
	public List<Product> viewAllProducts() {
	   return PR.findAll();   
	}
	  
	// Delete product by id
	public void deleteProduct(int id) {
	   PR.deleteById(id);
	}
	  
	// Get product by name 
//	public Product viewProductByname(String name) {
//	   return PR.getProductByName(name);    
//	}
	

}
