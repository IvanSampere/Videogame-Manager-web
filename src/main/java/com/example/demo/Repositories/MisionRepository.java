package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Mision;
import com.example.demo.Zone;

@Repository
public interface MisionRepository extends CrudRepository<Mision, Integer> {

	Mision findByName(String name);
	
}
