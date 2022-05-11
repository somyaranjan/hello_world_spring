package com.somyaranjan.hello_world.repository;

import com.somyaranjan.hello_world.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
