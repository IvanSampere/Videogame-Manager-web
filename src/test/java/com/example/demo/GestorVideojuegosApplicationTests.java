package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestorVideojuegosApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testDeleteHability() {
		
		Item item = new Weapon();
		
		Hability habilidad1 = new Hability();
		Hability habilidad2 = new Hability();
		Hability habilidad3 = new Hability();
		Hability habilidad4 = new Hability();
		Hability habilidad6 = new Hability();
		habilidad6.setName("6");
		
		item.accions.add(habilidad1);
		item.accions.add(habilidad2);
		item.accions.add(habilidad3);
		item.accions.add(habilidad4);
		
		System.out.println(item.accions.size());
		System.out.println(item.toString());
		
		boolean delete = false;
		
		if(item.accions.contains(habilidad1)==true) {
			delete = true;
		}
		
		if(delete==true) {
			int indexRemove = item.accions.indexOf(habilidad1);
			item.accions.remove(indexRemove);
		}
		
		System.out.println(item.toString());
		
		System.out.println(delete);
		System.out.println(item.accions.size());
	}
}
