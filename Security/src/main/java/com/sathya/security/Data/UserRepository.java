package com.sathya.security.Data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.Entites.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
