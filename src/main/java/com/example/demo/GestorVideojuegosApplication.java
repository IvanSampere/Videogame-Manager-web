package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class GestorVideojuegosApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(GestorVideojuegosApplication.class, args);
	}

	@Transactional(readOnly = true)
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
