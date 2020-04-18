package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestorVideojuegosApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testAddHability() {
		Item item = new Weapon();
		Hability hability = new Hability("habilidad1", 20, 20, "Fire");
		
		System.out.println(item.getAccions());
		System.out.println(item.accions.toString());
		
		item.addHability(hability);
		boolean check = item.accions.contains(hability);
		System.out.println(check);
		System.out.println(item.accions.toString());
		System.out.println(item.getAccions().size());
		item.deleteHability(hability);
		System.out.println(item.accions.toString());
		System.out.println(item.getAccions().size());
		
	}
}
