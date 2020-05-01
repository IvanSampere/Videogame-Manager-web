package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Item;
import com.example.demo.Zone;

@Repository
public interface ZoneRepository extends CrudRepository<Zone, Integer> {

	Zone findByName(String name);

	
}
