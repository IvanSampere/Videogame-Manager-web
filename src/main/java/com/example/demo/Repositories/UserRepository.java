package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByNick(String name);
	
}
