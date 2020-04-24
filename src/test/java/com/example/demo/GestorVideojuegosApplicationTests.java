package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repositories.HabilityRepository;

@SpringBootTest
class GestorVideojuegosApplicationTests {
	
	@Autowired
	HabilityRepository habilityRepo;
	
	@Test
	void testAddHability() {
		
		Hability hability = new Hability("Maribelita",1,1,"1");
		habilityRepo.save(hability);
		
		List<Hability> nameRepo = (List<Hability>) habilityRepo.findAll();
		
		for(Hability name:nameRepo) {
			System.out.println(name.getName());
		}
		
		
	}
}
