package com.student.springproducts.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.student.springproducts.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

