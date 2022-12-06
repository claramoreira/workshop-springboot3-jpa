package com.claramoreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claramoreira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
