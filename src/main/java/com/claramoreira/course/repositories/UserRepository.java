package com.claramoreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claramoreira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
