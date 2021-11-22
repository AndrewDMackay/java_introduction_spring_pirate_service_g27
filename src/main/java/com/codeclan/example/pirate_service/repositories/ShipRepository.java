
package com.codeclan.example.pirate_service.repositories;

import com.codeclan.example.pirate_service.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
