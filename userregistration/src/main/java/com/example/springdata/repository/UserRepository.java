package com.example.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springdata.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
