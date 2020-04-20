package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repositories.HabilityRepository;
import com.example.demo.Repositories.ItemRepositoy;

@SpringBootApplication
public class GestorVideojuegosApplication implements CommandLineRunner{
	
	@Autowired
	ItemRepositoy repo;
	@Autowired
	HabilityRepository repoH;
	
	public static void main(String[] args) {
		SpringApplication.run(GestorVideojuegosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
