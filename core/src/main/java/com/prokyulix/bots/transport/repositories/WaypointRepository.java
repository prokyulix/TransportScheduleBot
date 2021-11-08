package com.prokyulix.bots.transport.repositories;

import com.prokyulix.bots.transport.entities.Waypoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaypointRepository extends JpaRepository<Waypoint, Long> {
}
