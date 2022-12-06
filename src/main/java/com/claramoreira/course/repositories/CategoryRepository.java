package com.claramoreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claramoreira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
