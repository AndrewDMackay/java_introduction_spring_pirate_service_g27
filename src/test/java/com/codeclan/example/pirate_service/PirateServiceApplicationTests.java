
package com.codeclan.example.pirate_service;

import com.codeclan.example.pirate_service.models.Pirate;
import com.codeclan.example.pirate_service.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePirate(){
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		pirateRepository.save(jack);
	}


}
