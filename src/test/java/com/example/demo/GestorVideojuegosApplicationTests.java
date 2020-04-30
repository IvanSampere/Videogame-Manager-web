package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repositories.HabilityRepository;
import com.example.demo.Repositories.ItemRepositoy;

@SpringBootTest
class GestorVideojuegosApplicationTests {
	

	@Autowired
	ItemRepositoy repo1;
	
	@Test
	void testAddHability() {
		
		System.out.println(repo1.findByName("Helmet1"));
		
	}
}
