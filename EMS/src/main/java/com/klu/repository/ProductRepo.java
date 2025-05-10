package com.klu.repository;

import com.klu.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

/*
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	@Query("SELECT p FROM Product p WHERE p.p_name = :name")
    Product getProductByName(@Param("name") String name);
}
*/