package com.prokyulix.bots.transport.utils;

import com.prokyulix.bots.transport.entities.Station;
import com.prokyulix.bots.transport.repositories.BusRepository;
import com.prokyulix.bots.transport.repositories.StationRepository;
import com.prokyulix.bots.transport.repositories.WaypointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DatabaseInitializator {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private WaypointRepository waypointRepository;

    public void initializeDatabase() {
        Arrays.asList(
                Station.builder().synchronizationCode("s9878392").name("Тутаев").subName("ЦРБ").build(),
                Station.builder().synchronizationCode("s9868453").name("Тутаев").subName("Звёздный").build(),
                Station.builder().synchronizationCode("s9868472").name("Тутаев").subName("Романов").build(),
                Station.builder().synchronizationCode("s9847690").name("Фоминское").build(),
                Station.builder().synchronizationCode("s9847692").name("Константиновский").subName("Волга").build(),
                Station.builder().synchronizationCode("s9847691").name("Константиновский").subName("Вокзал").build(),
                Station.builder().synchronizationCode("s9847594").name("Пустово").build(),
                Station.builder().synchronizationCode("s9847767").name("Ярославль").subName("15 микрорайон")
                        .description("Не является отправной в сторону Тутаева").build(),
                Station.builder().synchronizationCode("s9833395").name("Ярославль").subName("14 микрорайон")
                        .description("Не является отправной в сторону остановки Ярославль-Главный").build(),
                Station.builder().synchronizationCode("s9879933").name("Ярославль").subName("ТРК Альтаир").build(),
                Station.builder().synchronizationCode("s9833392").name("Ярославль").subName("Волгоградская")
                        .description("Не является отправной в сторону Тутаева").build(),
                Station.builder().synchronizationCode("s9600360").name("Ярославль").subName("Ярославль-Главный").build()
        ).forEach(stationRepository::saveAndFlush);


    }
}
