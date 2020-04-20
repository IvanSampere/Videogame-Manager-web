package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestorVideojuegosApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testValidateDni() {
		boolean dniOk = false;
		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B'
				,'N','J','Z','S','Q','V','H','L','C','K','E','T'};
		
		
		String dni1 = "53248P94M";
		String dni = dni1;
		
		
		
		if(dni.length()==9) {
			try {
				
				dni.toCharArray();
				String subDni = dni.substring(0, 8);
				int numDni = Integer.parseInt(subDni);
				int result = numDni%23;
				
				if(dni.charAt(8)==letras[result]) {
					dniOk = true;
				}
				
			} catch(NumberFormatException e) {
				System.out.println("Error en DNI");
				dniOk = false;
			}
		}else {
			dniOk = false;
		}
		
		System.out.println(dniOk);
	}
}
