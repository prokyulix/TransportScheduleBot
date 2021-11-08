package com.prokyulix.bots.transport.repositories;

import com.prokyulix.bots.transport.entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
}
