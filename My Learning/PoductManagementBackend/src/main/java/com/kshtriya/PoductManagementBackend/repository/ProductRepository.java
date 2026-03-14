package com.kshtriya.PoductManagementBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kshtriya.PoductManagementBackend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> 
	{

}
