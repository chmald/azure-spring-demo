package com.chmald.springdemo;

import org.springframework.data.repository.CrudRepository;

import com.chmald.springdemo.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}