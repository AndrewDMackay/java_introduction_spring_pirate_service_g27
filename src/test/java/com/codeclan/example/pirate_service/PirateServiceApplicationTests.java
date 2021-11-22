
package com.codeclan.example.pirate_service;

import com.codeclan.example.pirate_service.models.Pirate;
import com.codeclan.example.pirate_service.models.Ship;
import com.codeclan.example.pirate_service.repositories.PirateRepository;
import com.codeclan.example.pirate_service.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePirate(){
		Ship ship1 = new Ship("The Bloody Awful");
		shipRepository.save(ship1);
		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship1);
		pirateRepository.save(jack);
	}


}
