package com.claramoreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claramoreira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
