package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Item;
import com.example.demo.MainCharacter;

@Repository
public interface MainCharacterRepository extends CrudRepository<MainCharacter, Integer> {

	MainCharacter findByName(String name);
	
}
