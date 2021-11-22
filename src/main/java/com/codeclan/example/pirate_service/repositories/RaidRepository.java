
package com.codeclan.example.pirate_service.repositories;

import com.codeclan.example.pirate_service.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {
}
