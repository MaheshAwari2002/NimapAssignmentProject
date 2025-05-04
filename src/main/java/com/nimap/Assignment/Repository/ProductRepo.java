package com.nimap.Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.Assignment.Entity.Product;


	
	@Repository
	public interface ProductRepo extends JpaRepository<Product, Long> {}

	



