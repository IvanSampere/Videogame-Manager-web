package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Hability;

@Repository
public interface HabilityRepository extends CrudRepository<Hability, Integer>{
	
	Hability findByName(String name);
	
}
