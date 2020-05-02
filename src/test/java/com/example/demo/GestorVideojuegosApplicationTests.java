package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.Repositories.ItemRepositoy;
import com.example.demo.Repositories.UserRepository;

@SpringBootTest
class GestorVideojuegosApplicationTests {
	
	@Autowired
	UserRepository userRepo;
	
	@Test
	void testAddHability() {
		User user = new User();
		
		user.setNick("aaa");
		
		userRepo.save(user);
		
		User user2 = userRepo.findByNick("aaa");
		System.out.println(user2.toString());
	}
}
