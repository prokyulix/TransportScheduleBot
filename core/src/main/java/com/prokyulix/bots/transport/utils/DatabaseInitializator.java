package com.prokyulix.bots.transport.utils;

import com.prokyulix.bots.transport.entities.Station;
import com.prokyulix.bots.transport.repositories.BusRepository;
import com.prokyulix.bots.transport.repositories.StationRepository;
import com.prokyulix.bots.transport.repositories.WaypointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializator {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private WaypointRepository waypointRepository;

    public void initializeDatabase() {
        Station station = Station.builder().name("Константиновский").subName("Вокзал").build();
        stationRepository.saveAndFlush(station);
    }
}
